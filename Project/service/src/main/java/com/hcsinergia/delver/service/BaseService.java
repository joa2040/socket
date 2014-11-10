package com.hcsinergia.delver.service;

import java.util.List;

import com.hcsinergia.delver.exception.BussinessException;

/**
 * Interfaz base que deben extender las interfaces de cada
 * uno de los servicios del socket 
 * para procesar los datos recibidos del modem
 * 
 * @author joaquin
 *
 */
public interface BaseService {

	/**
	 * Procesa los datos recibidos del modem
	 * 
	 * @param input - Datos enviados por el modem
	 * @return Acknowledge
	 * @throws BussinessException
	 */
	String processEntity(List<String> input) throws BussinessException;

}
