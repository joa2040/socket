package com.hcsinergia.delver.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.DatoCrudo;
import com.hcsinergia.delver.service.BaseService;
import com.hcsinergia.delver.service.DatoCrudoService;
import com.hcsinergia.delver.service.DispatcherSocketService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
public class DispatcherSocketServiceImpl implements DispatcherSocketService {
	
	private static final int ENTITY_POSITION = 2;
	private static final String APPEND_SERVICE_IMPL = "ServiceImpl";
	private static final String SEPARATOR = ",";
	
	@Autowired
	private DatoCrudoService datoCrudoService;
	
	private static final Logger logger = Logger.getLogger(DispatcherSocketServiceImpl.class);
	
	@Autowired
	private ApplicationContext context;
	
	/*
	 * @see com.hcsinergia.delver.service.DispatcherSocketService#processRequestClient(java.lang.String)
	 */
	@Override
	@Transactional
	public String processRequestClient(String input) {
		try {
			logger.info("Dato recibido: " + input);
			datoCrudoService.persist(fillDatoCrudo(input));
			List<String> data = Arrays.asList(input.split(SEPARATOR));
			if (data.size() == 1 && (data.get(0).equals(MessageConstants.ATO_CONNECT) || data.get(0).equals(MessageConstants.AT_CONNECT))) {
				return MessageConstants.OK_RESPONSE;
			}
			this.checkSum(data, input);
			String bean = data.get(ENTITY_POSITION).toLowerCase() + APPEND_SERVICE_IMPL;
			logger.info("Entity: " + bean.toUpperCase());
			BaseService service = (BaseService) context.getBean(bean);
			return service.processEntity(data);
//			return MessageConstants.OK_RESPONSE;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return MessageConstants.ERROR_RESPONSE;
//			return MessageConstants.OK_RESPONSE;
		}
	}
	
	private void checkSum (List<String> data, String input) throws BussinessException {
		try {
			String checkSum = data.get(data.size() - 1);
			logger.info("checkSum: " + checkSum);
			
			int sumBytes = getCheckSum(input);	
			int decimalCheckSum = Integer.parseInt(checkSum.substring(2, checkSum.length()), 16);
			logger.info("Decimal checkSum: " + decimalCheckSum);
			if (!data.get(0).equals(MessageConstants.HEADER_REQUEST)) {
				throw new BussinessException("Header incorrecto");
			}
			if (decimalCheckSum != sumBytes) {
				throw new BussinessException("CheckSum incorrecto");
			}
		} catch (Exception e) {
			logger.error("CheckSum failed: " + e.getMessage(), e);
		}
	}
	
	private DatoCrudo fillDatoCrudo(String dato) {
		DatoCrudo datoCrudo = new DatoCrudo();
		datoCrudo.setDatoCrudo(dato);
		return datoCrudo;
	}
	
	private Integer getCheckSum(String input) {
		byte[] bytes = input.getBytes();
		Integer sumBytes = 0;
		for (int i = 0; i < bytes.length - 6; i++) {
			sumBytes += bytes[i];			
		}
		return sumBytes;
	}
}
