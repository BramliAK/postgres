package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the t_valeurtypetech database table.
 * 
 */
@Entity
@Table(name="t_valeurtypetech")
@NamedQuery(name="TValeurtypetech.findAll", query="SELECT t FROM TValeurtypetech t")
public class TValeurtypetech implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TValeurtypetechPK id;

	private BigDecimal valeur;

	//bi-directional many-to-one association to TParametre
	@ManyToOne
	@JoinColumn(name="code_parametre",insertable = false, updatable = false)
	private TParametre TParametre;

	//bi-directional many-to-one association to TTypetechnicien
	@ManyToOne
	@JoinColumn(name="code_typetech",insertable = false, updatable = false)
	private TTypetechnicien TTypetechnicien;

	public TValeurtypetech() {
	}

	public TValeurtypetechPK getId() {
		return this.id;
	}

	public void setId(TValeurtypetechPK id) {
		this.id = id;
	}

	public BigDecimal getValeur() {
		return this.valeur;
	}

	public void setValeur(BigDecimal valeur) {
		this.valeur = valeur;
	}

	public TParametre getTParametre() {
		return this.TParametre;
	}

	public void setTParametre(TParametre TParametre) {
		this.TParametre = TParametre;
	}

	public TTypetechnicien getTTypetechnicien() {
		return this.TTypetechnicien;
	}

	public void setTTypetechnicien(TTypetechnicien TTypetechnicien) {
		this.TTypetechnicien = TTypetechnicien;
	}

}