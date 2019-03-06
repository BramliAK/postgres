package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The primary key class for the t_isochrone database table.
 * 
 */
@Embeddable
public class TIsochronePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private BigDecimal latitude;

	private BigDecimal longitude;

	@Column(name="max_travel")
	private Long maxTravel;

	public TIsochronePK() {
	}
	public BigDecimal getLatitude() {
		return this.latitude;
	}
	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}
	public BigDecimal getLongitude() {
		return this.longitude;
	}
	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}
	public Long getMaxTravel() {
		return this.maxTravel;
	}
	public void setMaxTravel(Long maxTravel) {
		this.maxTravel = maxTravel;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TIsochronePK)) {
			return false;
		}
		TIsochronePK castOther = (TIsochronePK)other;
		return 
			(this.latitude == castOther.latitude)
			&& (this.longitude == castOther.longitude)
			&& this.maxTravel.equals(castOther.maxTravel);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		//hash = hash * prime + ((int) (this.latitude ^ (this.latitude >>> 32)));
		//hash = hash * prime + ((int) (this.longitude ^ (this.longitude >>> 32)));
		hash = hash * prime + this.maxTravel.hashCode();
		
		return hash;
	}
}