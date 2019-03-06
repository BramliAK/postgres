package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the t_competencetech database table.
 * 
 */
@Entity
@Table(name="t_competencetech")
@NamedQuery(name="TCompetencetech.findAll", query="SELECT t FROM TCompetencetech t")
public class TCompetencetech implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TCompetencetechPK id;

	private BigDecimal preference;

	private BigDecimal proficiency;

	//bi-directional many-to-one association to TCompetence
	@ManyToOne
	@JoinColumn(name="code_competence",insertable = false, updatable = false)
	private TCompetence TCompetence;

	//bi-directional many-to-one association to TTechnicien
	@ManyToOne
	@JoinColumn(name="id_technicien",insertable = false, updatable = false)
	private TTechnicien TTechnicien;

	public TCompetencetech() {
	}

	public TCompetencetechPK getId() {
		return this.id;
	}

	public void setId(TCompetencetechPK id) {
		this.id = id;
	}

	public BigDecimal getPreference() {
		return this.preference;
	}

	public void setPreference(BigDecimal preference) {
		this.preference = preference;
	}

	public BigDecimal getProficiency() {
		return this.proficiency;
	}

	public void setProficiency(BigDecimal proficiency) {
		this.proficiency = proficiency;
	}

	public TCompetence getTCompetence() {
		return this.TCompetence;
	}

	public void setTCompetence(TCompetence TCompetence) {
		this.TCompetence = TCompetence;
	}

	public TTechnicien getTTechnicien() {
		return this.TTechnicien;
	}

	public void setTTechnicien(TTechnicien TTechnicien) {
		this.TTechnicien = TTechnicien;
	}

}