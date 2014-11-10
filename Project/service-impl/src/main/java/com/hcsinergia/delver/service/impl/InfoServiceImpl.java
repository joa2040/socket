package com.hcsinergia.delver.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.exception.BussinessException;
import com.hcsinergia.delver.model.Info;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.InfoService;
import com.hcsinergia.delver.util.MessageConstants;

@Service
public class InfoServiceImpl implements InfoService{
	
	@Autowired
	private Dao<Info> dao;
	
	/*
	 * @see com.hcsinergia.delver.service.BaseService#processEntity(java.util.List)
	 */
	@Override
	public String processEntity(List<String> input) throws BussinessException{
		
			Info info = new Info();
			info.setNroInfo(Integer.valueOf(input.get(3)));
			info.setTouridx(input.get(4));
			info.setInfono(input.get(5));
			info.setTime(input.get(6));
			info.setDate(input.get(7));
			info.setChkSum(input.get(8));
			dao.persist(info);
			return MessageConstants.OK_RESPONSE;
	}

	@Override
	public void persist(Info info) {
		dao.persist(info);		
	}

	@Override
	public Info find(Object key) {
		return dao.find(Info.class, key);
	}

	@Override
	public Info update(Info info) {
		return dao.update(info);
	}

}
