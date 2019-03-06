package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_disponibilite database table.
 * 
 */
@Entity
@Table(name="t_disponibilite")
@NamedQuery(name="TDisponibilite.findAll", query="SELECT t FROM TDisponibilite t")
public class TDisponibilite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_disponibilite")
	private BigDecimal idDisponibilite;

	@Column(name="d_disponibilite")
	private Timestamp dDisponibilite;

	private String horaires;

	@Column(name="id_technicien")
	private Long idTechnicien;

	//bi-directional many-to-one association to TAdresse
	@ManyToOne
	@JoinColumn(name="id_adresse_end",insertable = false, updatable = false)
	private TAdresse TAdresse1;

	//bi-directional many-to-one association to TAdresse
	@ManyToOne
	@JoinColumn(name="id_adresse_start",insertable = false, updatable = false)
	private TAdresse TAdresse2;

	//bi-directional many-to-one association to TSecteur
	@ManyToOne
	@JoinColumn(name="code_secteur",insertable = false, updatable = false)
	private TSecteur TSecteur;

	public TDisponibilite() {
	}

	public BigDecimal getIdDisponibilite() {
		return this.idDisponibilite;
	}

	public void setIdDisponibilite(BigDecimal idDisponibilite) {
		this.idDisponibilite = idDisponibilite;
	}

	public Timestamp getDDisponibilite() {
		return this.dDisponibilite;
	}

	public void setDDisponibilite(Timestamp dDisponibilite) {
		this.dDisponibilite = dDisponibilite;
	}

	public String getHoraires() {
		return this.horaires;
	}

	public void setHoraires(String horaires) {
		this.horaires = horaires;
	}

	public Long getIdTechnicien() {
		return this.idTechnicien;
	}

	public void setIdTechnicien(Long idTechnicien) {
		this.idTechnicien = idTechnicien;
	}

	public TAdresse getTAdresse1() {
		return this.TAdresse1;
	}

	public void setTAdresse1(TAdresse TAdresse1) {
		this.TAdresse1 = TAdresse1;
	}

	public TAdresse getTAdresse2() {
		return this.TAdresse2;
	}

	public void setTAdresse2(TAdresse TAdresse2) {
		this.TAdresse2 = TAdresse2;
	}

	public TSecteur getTSecteur() {
		return this.TSecteur;
	}

	public void setTSecteur(TSecteur TSecteur) {
		this.TSecteur = TSecteur;
	}

}