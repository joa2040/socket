package com.hcsinergia.delver.service;

import com.hcsinergia.delver.model.Trasvase;

public interface TrasvaseService {
	
	void persist(Trasvase trasvase);

	Trasvase find(Object key);

	Trasvase update(Trasvase entity);
}
