package com.hcsinergia.delver.service;

import com.hcsinergia.delver.model.Info;

public interface InfoService extends BaseService {

	void persist(Info info);

	Info find(Object key);

	Info update(Info entity);
}
