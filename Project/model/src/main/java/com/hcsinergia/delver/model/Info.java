package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Info
 * 
 * @author joaquin
 *
 */
@Entity
@Table(name = "info")
public class Info extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4936103404393841117L;
	
	@Id
	@Column(name = "INFO_ID")
	@GeneratedValue
	private int id;
	
	@Column
	private int nroInfo;
	
	@Column
	private String infono;
	
	@Column
	private String time;
	
	@Column
	private String date;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nroInfo
	 */
	public int getNroInfo() {
		return nroInfo;
	}

	/**
	 * @param nroInfo the nroInfo to set
	 */
	public void setNroInfo(int nroInfo) {
		this.nroInfo = nroInfo;
	}

	/**
	 * @return the infono
	 */
	public String getInfono() {
		return infono;
	}

	/**
	 * @param infono the infono to set
	 */
	public void setInfono(String infono) {
		this.infono = infono;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the String
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param String the String to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
}
