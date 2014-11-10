package com.hcsinergia.delver.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Recorrido;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.RecorridoService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
public class RecorridoServiceImpl implements RecorridoService{
	
	@Autowired
	private Dao<Recorrido> dao;
	
	/*
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyy");
		SimpleDateFormat sdfTime = new SimpleDateFormat("hhmm");		
		try {
			Recorrido recorrido = new Recorrido();
			recorrido.setNroRecorrido(Integer.valueOf(input.get(3)));
			recorrido.setTouridx(input.get(4));
			recorrido.setNroCamion(Integer.valueOf(input.get(5)));
			recorrido.setNroCuenta(Integer.valueOf(input.get(6)));
			recorrido.setRemito(Integer.valueOf(input.get(7)));
			recorrido.setNroAcoplado(Integer.valueOf(input.get(8)));
			recorrido.setRecorrido(Integer.valueOf(input.get(9)));
			recorrido.setHoraInicio(sdfTime.parse(input.get(10)));
			recorrido.setHoraFin(sdfTime.parse(input.get(11)));
			recorrido.setFechaInicio(sdf.parse(input.get(12)));
			recorrido.setFechaFin(sdf.parse(input.get(13)));
			recorrido.setCantidadTotal(Float.valueOf(input.get(14)));
			recorrido.setContadorMuestras(Integer.valueOf(input.get(15)));			
			recorrido.setChkSum(input.get(16));
			dao.persist(recorrido);
			return MessageConstants.OK_RESPONSE;
		} catch (ParseException e) {
			throw new BussinessException(e.getMessage());
		}
	}

	@Override
	public void persist(Recorrido recorrido) {
		dao.persist(recorrido);
	}

	@Override
	public Recorrido find(Object key) {
		return dao.find(Recorrido.class, key);
	}

	@Override
	public Recorrido update(Recorrido entity) {
		return dao.update(entity);
	}

}
