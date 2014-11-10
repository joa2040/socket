package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Cip
 * 
 * @author joaquin
 *
 */
@Entity
@Table(name = "cip")
public class Cip extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 425718935040474463L;
	
	@Id	
	@Column(name = "CIP_ID")
	@GeneratedValue
	private int id;
	
	@Column
	private int nroCip;
	
	@Column
	private int nroCamion;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String fecha;
	
	@Column
	private Float tempaver;
	
	@Column
	private Float tempmin;
	
	@Column
	private Float tempmax;
	
	@Column
	private Float totalLitros;

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
	 * @return the nroCip
	 */
	public int getNroCip() {
		return nroCip;
	}

	/**
	 * @param nroCip the nroCip to set
	 */
	public void setNroCip(int nroCip) {
		this.nroCip = nroCip;
	}

	/**
	 * @return the nroCamion
	 */
	public int getNroCamion() {
		return nroCamion;
	}

	/**
	 * @param nroCamion the nroCamion to set
	 */
	public void setNroCamion(int nroCamion) {
		this.nroCamion = nroCamion;
	}

	/**
	 * @return the horaInicio
	 */
	public String getHoraInicio() {
		return horaInicio;
	}

	/**
	 * @param horaInicio the horaInicio to set
	 */
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	/**
	 * @return the horaFin
	 */
	public String getHoraFin() {
		return horaFin;
	}

	/**
	 * @param horaFin the horaFin to set
	 */
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the tempaver
	 */
	public Float getTempaver() {
		return tempaver;
	}

	/**
	 * @param tempaver the tempaver to set
	 */
	public void setTempaver(Float tempaver) {
		this.tempaver = tempaver;
	}

	/**
	 * @return the tempmin
	 */
	public Float getTempmin() {
		return tempmin;
	}

	/**
	 * @param tempmin the tempmin to set
	 */
	public void setTempmin(Float tempmin) {
		this.tempmin = tempmin;
	}

	/**
	 * @return the tempmax
	 */
	public Float getTempmax() {
		return tempmax;
	}

	/**
	 * @param tempmax the tempmax to set
	 */
	public void setTempmax(Float tempmax) {
		this.tempmax = tempmax;
	}

	/**
	 * @return the totalLitros
	 */
	public Float getTotalLitros() {
		return totalLitros;
	}

	/**
	 * @param totalLitros the totalLitros to set
	 */
	public void setTotalLitros(Float totalLitros) {
		this.totalLitros = totalLitros;
	}	
}
