package com.hcsinergia.delver.service.impl;

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
			Recorrido recorrido = new Recorrido();
			recorrido.setNroRecorrido(Integer.valueOf(input.get(3)));
			recorrido.setTouridx(input.get(4));
			recorrido.setNroCamion(Integer.valueOf(input.get(5)));
			recorrido.setNroCuenta(Integer.valueOf(input.get(6)));
			recorrido.setRemito(!input.get(7).isEmpty() ? Integer.valueOf(input.get(7)) : 0);
			recorrido.setNroAcoplado(Integer.valueOf(input.get(8)));
			recorrido.setRecorrido(Integer.valueOf(input.get(9)));
			recorrido.setHoraInicio(input.get(10));
			recorrido.setHoraFin(input.get(11));
			recorrido.setFechaInicio(input.get(12));
			recorrido.setFechaFin(input.get(13));
			recorrido.setCantidadTotal(Float.valueOf(input.get(14)));
			recorrido.setContadorMuestras(Integer.valueOf(input.get(15)));			
			recorrido.setChkSum(input.get(16));
			dao.persist(recorrido);
			return MessageConstants.OK_RESPONSE;
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
