package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Cip;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.CipService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
public class CipServiceImpl implements CipService {
	
	@Autowired
	private Dao<Cip> dao;
	
	/* 
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException {
			Cip cip = new Cip();
			cip.setNroCip(Integer.valueOf(input.get(3)));
			cip.setTouridx(input.get(4));
			cip.setNroCamion(Integer.valueOf(input.get(5)));			
			cip.setHoraFin(input.get(6));
			cip.setHoraInicio(input.get(7));
			cip.setFecha(input.get(8));
			cip.setTempaver(Float.valueOf(input.get(9)));
			cip.setTempmin(Float.valueOf(input.get(10)));
			cip.setTempmax(Float.valueOf(input.get(11)));
			cip.setTotalLitros(Float.valueOf(input.get(12)));
			cip.setChkSum(input.get(13));
			dao.persist(cip);
			return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Cip cip) {
		dao.persist(cip);
	}

	@Override
	public Cip find(Object key) {		
		return dao.find(Cip.class, key);
	}

	@Override
	public Cip update(Cip entity) {
		return dao.update(entity);
	}

}
