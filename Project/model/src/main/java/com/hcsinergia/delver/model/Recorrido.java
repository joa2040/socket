package com.hcsinergia.delver.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase entidad Recorrido
 * 
 * @author joaquin
 *
 */
@Entity
@Table(name = "recorrido")
public class Recorrido extends BaseEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1052620026257639367L;
	
	@Id	
	@Column(name = "RECORRIDO_ID")
	@GeneratedValue
	private int id;
	
	@Column
	private int nroRecorrido;
	
	@Column
	private int nroCamion;
	
	@Column
	private int nroCuenta;
	
	@Column
	private int remito;
	
	@Column
	private int nroAcoplado;
	
	@Column
	private int recorrido;
	
	@Column
	private String horaInicio;
	
	@Column
	private String horaFin;
	
	@Column
	private String fechaInicio;
	
	@Column
	private String FechaFin;
	
	@Column
	private Float cantidadTotal;
	
	@Column
	private int contadorMuestras;

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
	 * @return the nroRecorrido
	 */
	public int getNroRecorrido() {
		return nroRecorrido;
	}

	/**
	 * @param nroRecorrido the nroRecorrido to set
	 */
	public void setNroRecorrido(int nroRecorrido) {
		this.nroRecorrido = nroRecorrido;
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
	 * @return the nroCuenta
	 */
	public int getNroCuenta() {
		return nroCuenta;
	}

	/**
	 * @param nroCuenta the nroCuenta to set
	 */
	public void setNroCuenta(int nroCuenta) {
		this.nroCuenta = nroCuenta;
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
	 * @return the nroAcoplado
	 */
	public int getNroAcoplado() {
		return nroAcoplado;
	}

	/**
	 * @param nroAcoplado the nroAcoplado to set
	 */
	public void setNroAcoplado(int nroAcoplado) {
		this.nroAcoplado = nroAcoplado;
	}

	/**
	 * @return the recorrido
	 */
	public int getRecorrido() {
		return recorrido;
	}

	/**
	 * @param recorrido the recorrido to set
	 */
	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
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
		return FechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
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
	 * @return the contadorMuestras
	 */
	public int getContadorMuestras() {
		return contadorMuestras;
	}

	/**
	 * @param contadorMuestras the contadorMuestras to set
	 */
	public void setContadorMuestras(int contadorMuestras) {
		this.contadorMuestras = contadorMuestras;
	}
}
