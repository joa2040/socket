package com.hcsinergia.delver.service;

import com.hcsinergia.delver.model.Tambo;

public interface TamboService extends BaseService {
	
	void persist(Tambo tambo);

	Tambo find(Object key);

	Tambo update(Tambo entity);
}
