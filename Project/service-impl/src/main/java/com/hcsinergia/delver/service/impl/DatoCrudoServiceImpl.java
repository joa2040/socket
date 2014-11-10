package com.hcsinergia.delver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcsinergia.delver.model.DatoCrudo;
import com.hcsinergia.delver.persistence.Dao;
import com.hcsinergia.delver.service.DatoCrudoService;

@Service
public class DatoCrudoServiceImpl implements DatoCrudoService {
	
	@Autowired
	private Dao<DatoCrudo> dao;
	
	@Override
	public void persist(DatoCrudo datoCrudo) {
		dao.persist(datoCrudo);
	}

}
