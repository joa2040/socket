package com.hcsinergia.delver.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase GPS
 * 
 * @author joaquin
 *
 */
@Entity
@Table(name = "gps")
public class Gps implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -61744170121711592L;
	
	@Id
	@Column(name = "GPS_ID")
	@GeneratedValue
	private int id;
	
	@Column
	private String utc;
	
	@Column
	private String latitude;
	
	@Column
	private String anos;
	
	@Column
	private String longitude;
	
	@Column
	private String eorw;
	
	@Column
	private String gpsQualityIndicator;
	
	@Column
	private int numberSatellites;
	
	@Column
	private String horizontalPrecision;
	
	@Column
	private String antenaAltitude;
	
	@Column
	private String unitAntenaAltitude;
	
	@Column
	private String geoidalSeparation;
	
	@Column
	private String ageDifferenctialGpsData;
	
	@Column
	private String diferentialReferenceStation;

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
	 * @return the utc
	 */
	public String getUtc() {
		return utc;
	}

	/**
	 * @param utc the utc to set
	 */
	public void setUtc(String utc) {
		this.utc = utc;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the anos
	 */
	public String getAnos() {
		return anos;
	}

	/**
	 * @param anos the anos to set
	 */
	public void setAnos(String anos) {
		this.anos = anos;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * @return the eorw
	 */
	public String getEorw() {
		return eorw;
	}

	/**
	 * @param eorw the eorw to set
	 */
	public void setEorw(String eorw) {
		this.eorw = eorw;
	}

	/**
	 * @return the gpsQualityIndicator
	 */
	public String getGpsQualityIndicator() {
		return gpsQualityIndicator;
	}

	/**
	 * @param gpsQualityIndicator the gpsQualityIndicator to set
	 */
	public void setGpsQualityIndicator(String gpsQualityIndicator) {
		this.gpsQualityIndicator = gpsQualityIndicator;
	}

	/**
	 * @return the numberSatellites
	 */
	public int getNumberSatellites() {
		return numberSatellites;
	}

	/**
	 * @param numberSatellites the numberSatellites to set
	 */
	public void setNumberSatellites(int numberSatellites) {
		this.numberSatellites = numberSatellites;
	}

	/**
	 * @return the horizontalPrecision
	 */
	public String getHorizontalPrecision() {
		return horizontalPrecision;
	}

	/**
	 * @param horizontalPrecision the horizontalPrecision to set
	 */
	public void setHorizontalPrecision(String horizontalPrecision) {
		this.horizontalPrecision = horizontalPrecision;
	}

	/**
	 * @return the antenaAltitude
	 */
	public String getAntenaAltitude() {
		return antenaAltitude;
	}

	/**
	 * @param antenaAltitude the antenaAltitude to set
	 */
	public void setAntenaAltitude(String antenaAltitude) {
		this.antenaAltitude = antenaAltitude;
	}

	/**
	 * @return the unitAntenaAltitude
	 */
	public String getUnitAntenaAltitude() {
		return unitAntenaAltitude;
	}

	/**
	 * @param unitAntenaAltitude the unitAntenaAltitude to set
	 */
	public void setUnitAntenaAltitude(String unitAntenaAltitude) {
		this.unitAntenaAltitude = unitAntenaAltitude;
	}

	/**
	 * @return the geoidalSeparation
	 */
	public String getGeoidalSeparation() {
		return geoidalSeparation;
	}

	/**
	 * @param geoidalSeparation the geoidalSeparation to set
	 */
	public void setGeoidalSeparation(String geoidalSeparation) {
		this.geoidalSeparation = geoidalSeparation;
	}

	/**
	 * @return the ageDifferenctialGpsData
	 */
	public String getAgeDifferenctialGpsData() {
		return ageDifferenctialGpsData;
	}

	/**
	 * @param ageDifferenctialGpsData the ageDifferenctialGpsData to set
	 */
	public void setAgeDifferenctialGpsData(String ageDifferenctialGpsData) {
		this.ageDifferenctialGpsData = ageDifferenctialGpsData;
	}

	/**
	 * @return the diferentialReferenceStation
	 */
	public String getDiferentialReferenceStation() {
		return diferentialReferenceStation;
	}

	/**
	 * @param diferentialReferenceStation the diferentialReferenceStation to set
	 */
	public void setDiferentialReferenceStation(String diferentialReferenceStation) {
		this.diferentialReferenceStation = diferentialReferenceStation;
	}
	
}
