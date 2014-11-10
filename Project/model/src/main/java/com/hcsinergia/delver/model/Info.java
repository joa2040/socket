package com.hcsinergia.delver.model;

import java.util.Date;

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
	private Date time;
	
	@Column
	private Date date;
	
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
	public Date getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
}
