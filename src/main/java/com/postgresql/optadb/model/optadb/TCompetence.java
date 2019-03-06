package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_competence database table.
 * 
 */
@Entity
@Table(name="t_competence")
@NamedQuery(name="TCompetence.findAll", query="SELECT t FROM TCompetence t")
public class TCompetence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_competence")
	private String codeCompetence;

	private short in360;

	//bi-directional many-to-one association to TCompetencetech
	@OneToMany(mappedBy="TCompetence")
	private Set<TCompetencetech> TCompetenceteches;

	//bi-directional many-to-many association to TInter
	@ManyToMany(mappedBy="TCompetences")
	private Set<TInter> TInters;

	//bi-directional many-to-many association to TInterBloquee
	@ManyToMany(mappedBy="TCompetences")
	private Set<TInterBloquee> TInterBloquees;

	public TCompetence() {
	}

	public String getCodeCompetence() {
		return this.codeCompetence;
	}

	public void setCodeCompetence(String codeCompetence) {
		this.codeCompetence = codeCompetence;
	}

	public short getIn360() {
		return this.in360;
	}

	public void setIn360(short in360) {
		this.in360 = in360;
	}

	public Set<TCompetencetech> getTCompetenceteches() {
		return this.TCompetenceteches;
	}

	public void setTCompetenceteches(Set<TCompetencetech> TCompetenceteches) {
		this.TCompetenceteches = TCompetenceteches;
	}

	public TCompetencetech addTCompetencetech(TCompetencetech TCompetencetech) {
		getTCompetenceteches().add(TCompetencetech);
		TCompetencetech.setTCompetence(this);

		return TCompetencetech;
	}

	public TCompetencetech removeTCompetencetech(TCompetencetech TCompetencetech) {
		getTCompetenceteches().remove(TCompetencetech);
		TCompetencetech.setTCompetence(null);

		return TCompetencetech;
	}

	public Set<TInter> getTInters() {
		return this.TInters;
	}

	public void setTInters(Set<TInter> TInters) {
		this.TInters = TInters;
	}

	public Set<TInterBloquee> getTInterBloquees() {
		return this.TInterBloquees;
	}

	public void setTInterBloquees(Set<TInterBloquee> TInterBloquees) {
		this.TInterBloquees = TInterBloquees;
	}

}