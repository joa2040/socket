package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datocrudo")
public class DatoCrudo {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private String datoCrudo;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the datoCrudo
	 */
	public String getDatoCrudo() {
		return datoCrudo;
	}

	/**
	 * @param datoCrudo the datoCrudo to set
	 */
	public void setDatoCrudo(String datoCrudo) {
		this.datoCrudo = datoCrudo;
	}
}
