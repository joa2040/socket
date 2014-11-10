package com.hcsinergia.delver.util;

/**
 * Constantes de mensajes y datos entre el modem y el socket
 * 
 * @author joaquin
 *
 */
public final class MessageConstants {
	
	private MessageConstants(){};
	
	public static final String ERROR_RESPONSE = "@E";
	public static final String OK_RESPONSE = "@K";
	public static final String AT_CONNECT = "AT";
	public static final String ATO_CONNECT = "ATO";
	public static final String HEADER_REQUEST = "$$";
}
