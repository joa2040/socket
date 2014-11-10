package com.hcsinergia.delver.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Tambo;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.TamboService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
public class TamboServiceImpl implements TamboService {
	
	@Autowired
	private Dao<Tambo> dao;

	/*
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		SimpleDateFormat sdfTime = new SimpleDateFormat("hhmm");		
		try {
			Tambo tambo = new Tambo();
			tambo.setNroTambo(Integer.valueOf(input.get(3)));
			tambo.setTouridx(input.get(4));
			tambo.setRemito(Integer.valueOf(input.get(5)));
			tambo.setCodigoTambero(Integer.valueOf(input.get(6)));
			tambo.setHoraFin(sdfTime.parse(input.get(7)));
			tambo.setHoraInicio(sdfTime.parse(input.get(8)));
			tambo.setFechaInicio(sdf.parse(input.get(9)));
			tambo.setFechaFin(sdf.parse(input.get(10)));
			tambo.setCantidadTotal(Float.valueOf(input.get(11)));
			tambo.setCompa(Integer.valueOf(input.get(12)));
			tambo.setCantidadA(Float.valueOf(input.get(13)));
			tambo.setCompb(Integer.valueOf(input.get(14)));
			tambo.setCantidadB(Float.valueOf(input.get(15)));
			tambo.setCompc(Integer.valueOf(input.get(16)));
			tambo.setCantidadC(Float.valueOf(input.get(17)));			
			tambo.setTempaver(Float.valueOf(input.get(18)));
			tambo.setTempmin(Float.valueOf(input.get(19)));
			tambo.setTempmax(Float.valueOf(input.get(20)));
			tambo.setStatus(Integer.valueOf(input.get(21)));
			tambo.setDesaInicial(Float.valueOf(input.get(22)));
			tambo.setDesaFinal(Float.valueOf(input.get(23)));
			tambo.setConstanteE(Float.valueOf(input.get(24)));
			tambo.setConstanteC(Float.valueOf(input.get(25)));			
			tambo.setChkSum(input.get(26));
			dao.persist(tambo);
			return MessageConstants.OK_RESPONSE;
		} catch (ParseException e) {
			throw new BussinessException(e.getMessage());
		}
	}

	@Override
	public void persist(Tambo tambo) {
		dao.persist(tambo);
	}

	@Override
	public Tambo find(Object key) {
		return dao.find(Tambo.class, key);
	}

	@Override
	public Tambo update(Tambo entity) {
		return dao.update(entity);
	}

}
