package com.hcsinergia.delver.service;

import com.hcsinergia.delver.model.Cip;

public interface CipService extends BaseService {
	
	void persist(Cip cip);

	Cip find(Object key);

	Cip update(Cip entity);
}
