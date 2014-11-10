package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Tambo
 * 
 * @author joaquin
 *
 */
@Entity
@Table(name = "tambo")
public class Tambo extends BaseEntity {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 435924898817920725L;
	
	@Id
	@Column(name = "TAMBO_ID")
	@GeneratedValue
	private int id;
	
	@Column
	private int nroTambo;
	
	@Column	
	private int remito;
	
	@Column
	private int codigoTambero;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String fechaInicio;
	
	@Column
	private String fechaFin;
	
	@Column
	private Float cantidadTotal;
	
	@Column
	private int compa;
	
	@Column
	private Float cantidadA;
	
	@Column
	private int compb;
	
	@Column
	private Float cantidadB;
	
	@Column
	private int compc;
	
	@Column
	private Float cantidadC;
	
	@Column
	private Float tempaver;
	
	@Column
	private Float tempmin;
	
	@Column
	private Float tempmax;
	
	@Column
	private int status;
	
	@Column
	private Float desaInicial;
	
	@Column
	private Float desaFinal;
	
	@Column
	private Float constanteE;
	
	@Column
	private Float constanteC;
	

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
	 * @return the nroTambo
	 */
	public int getNroTambo() {
		return nroTambo;
	}

	/**
	 * @param nroTambo the nroTambo to set
	 */
	public void setNroTambo(int nroTambo) {
		this.nroTambo = nroTambo;
	}

	/**
	 * @return the remito
	 */
	public int getRemito() {
		return remito;
	}

	/**
	 * @param remito the remito to set
	 */
	public void setRemito(int remito) {
		this.remito = remito;
	}

	/**
	 * @return the codigoTambero
	 */
	public int getCodigoTambero() {
		return codigoTambero;
	}

	/**
	 * @param codigoTambero the codigoTambero to set
	 */
	public void setCodigoTambero(int codigoTambero) {
		this.codigoTambero = codigoTambero;
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
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	public String getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the cantidadTotal
	 */
	public Float getCantidadTotal() {
		return cantidadTotal;
	}

	/**
	 * @param cantidadTotal the cantidadTotal to set
	 */
	public void setCantidadTotal(Float cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	/**
	 * @return the compa
	 */
	public int getCompa() {
		return compa;
	}

	/**
	 * @param compa the compa to set
	 */
	public void setCompa(int compa) {
		this.compa = compa;
	}

	/**
	 * @return the cantidadA
	 */
	public Float getCantidadA() {
		return cantidadA;
	}

	/**
	 * @param cantidadA the cantidadA to set
	 */
	public void setCantidadA(Float cantidadA) {
		this.cantidadA = cantidadA;
	}

	/**
	 * @return the compb
	 */
	public int getCompb() {
		return compb;
	}

	/**
	 * @param compb the compb to set
	 */
	public void setCompb(int compb) {
		this.compb = compb;
	}

	/**
	 * @return the cantidadB
	 */
	public Float getCantidadB() {
		return cantidadB;
	}

	/**
	 * @param cantidadB the cantidadB to set
	 */
	public void setCantidadB(Float cantidadB) {
		this.cantidadB = cantidadB;
	}

	/**
	 * @return the compc
	 */
	public int getCompc() {
		return compc;
	}

	/**
	 * @param compc the compc to set
	 */
	public void setCompc(int compc) {
		this.compc = compc;
	}

	/**
	 * @return the cantidadC
	 */
	public Float getCantidadC() {
		return cantidadC;
	}

	/**
	 * @param cantidadC the cantidadC to set
	 */
	public void setCantidadC(Float cantidadC) {
		this.cantidadC = cantidadC;
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
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the desaInicial
	 */
	public Float getDesaInicial() {
		return desaInicial;
	}

	/**
	 * @param desaInicial the desaInicial to set
	 */
	public void setDesaInicial(Float desaInicial) {
		this.desaInicial = desaInicial;
	}

	/**
	 * @return the desaFinal
	 */
	public Float getDesaFinal() {
		return desaFinal;
	}

	/**
	 * @param desaFinal the desaFinal to set
	 */
	public void setDesaFinal(Float desaFinal) {
		this.desaFinal = desaFinal;
	}

	/**
	 * @return the constanteE
	 */
	public Float getConstanteE() {
		return constanteE;
	}

	/**
	 * @param constanteE the constanteE to set
	 */
	public void setConstanteE(Float constanteE) {
		this.constanteE = constanteE;
	}

	/**
	 * @return the constanteC
	 */
	public Float getConstanteC() {
		return constanteC;
	}

	/**
	 * @param constanteC the constanteC to set
	 */
	public void setConstanteC(Float constanteC) {
		this.constanteC = constanteC;
	}
	
}
