package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the t_equipement database table.
 * 
 */
@Entity
@Table(name="t_equipement")
@NamedQuery(name="TEquipement.findAll", query="SELECT t FROM TEquipement t")
public class TEquipement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_equipement")
	private String codeEquipement;

	private BigDecimal latitude;

	private BigDecimal longitude;

	@Column(name="type_equipement",insertable = false, updatable = false)
	private String typeEquipement;

	//bi-directional many-to-one association to TAdresse
	@ManyToOne
	@JoinColumn(name="id_adresse",insertable = false, updatable = false)
	private TAdresse TAdresse;

	public TEquipement() {
	}

	public String getCodeEquipement() {
		return this.codeEquipement;
	}

	public void setCodeEquipement(String codeEquipement) {
		this.codeEquipement = codeEquipement;
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

	public String getTypeEquipement() {
		return this.typeEquipement;
	}

	public void setTypeEquipement(String typeEquipement) {
		this.typeEquipement = typeEquipement;
	}

	public TAdresse getTAdresse() {
		return this.TAdresse;
	}

	public void setTAdresse(TAdresse TAdresse) {
		this.TAdresse = TAdresse;
	}

}