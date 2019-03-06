package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Set;


/**
 * The persistent class for the t_geocode database table.
 * 
 */
@Entity
@Table(name="t_geocode")
@NamedQuery(name="TGeocode.findAll", query="SELECT t FROM TGeocode t")
public class TGeocode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="id_geocode")
	private BigInteger idGeocode;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private String niveaugeo;

	//bi-directional many-to-one association to TAdresse
	@OneToMany(mappedBy="TGeocode")
	private Set<TAdresse> TAdresses;

	public TGeocode() {
	}

	public BigInteger getIdGeocode() {
		return this.idGeocode;
	}

	public void setIdGeocode(BigInteger idGeocode) {
		this.idGeocode = idGeocode;
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

	public String getNiveaugeo() {
		return this.niveaugeo;
	}

	public void setNiveaugeo(String niveaugeo) {
		this.niveaugeo = niveaugeo;
	}

	public Set<TAdresse> getTAdresses() {
		return this.TAdresses;
	}

	public void setTAdresses(Set<TAdresse> TAdresses) {
		this.TAdresses = TAdresses;
	}

	public TAdresse addTAdress(TAdresse TAdress) {
		getTAdresses().add(TAdress);
		TAdress.setTGeocode(this);

		return TAdress;
	}

	public TAdresse removeTAdress(TAdresse TAdress) {
		getTAdresses().remove(TAdress);
		TAdress.setTGeocode(null);

		return TAdress;
	}

}