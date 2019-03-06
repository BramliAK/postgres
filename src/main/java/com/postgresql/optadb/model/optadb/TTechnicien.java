package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_technicien database table.
 * 
 */
@Entity
@Table(name="t_technicien")
@NamedQuery(name="TTechnicien.findAll", query="SELECT t FROM TTechnicien t")
public class TTechnicien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_technicien")
	private long idTechnicien;

	@Column(name="code_technicien")
	private String codeTechnicien;

	private short equipe;

	private short in360;

	//bi-directional many-to-one association to TCompetencetech
	@OneToMany(mappedBy="TTechnicien")
	private Set<TCompetencetech> TCompetenceteches;

	//bi-directional many-to-one association to TInter
	@OneToMany(mappedBy="TTechnicien1")
	private Set<TInter> TInters1;

	//bi-directional many-to-one association to TInter
	@OneToMany(mappedBy="TTechnicien2")
	private Set<TInter> TInters2;

	//bi-directional many-to-one association to TTypetechnicien
	@ManyToOne
	@JoinColumn(name="code_typetech",insertable = false, updatable = false)
	private TTypetechnicien TTypetechnicien;

	public TTechnicien() {
	}

	public long getIdTechnicien() {
		return this.idTechnicien;
	}

	public void setIdTechnicien(long idTechnicien) {
		this.idTechnicien = idTechnicien;
	}

	public String getCodeTechnicien() {
		return this.codeTechnicien;
	}

	public void setCodeTechnicien(String codeTechnicien) {
		this.codeTechnicien = codeTechnicien;
	}

	public short getEquipe() {
		return this.equipe;
	}

	public void setEquipe(short equipe) {
		this.equipe = equipe;
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
		TCompetencetech.setTTechnicien(this);

		return TCompetencetech;
	}

	public TCompetencetech removeTCompetencetech(TCompetencetech TCompetencetech) {
		getTCompetenceteches().remove(TCompetencetech);
		TCompetencetech.setTTechnicien(null);

		return TCompetencetech;
	}

	public Set<TInter> getTInters1() {
		return this.TInters1;
	}

	public void setTInters1(Set<TInter> TInters1) {
		this.TInters1 = TInters1;
	}

	public TInter addTInters1(TInter TInters1) {
		getTInters1().add(TInters1);
		TInters1.setTTechnicien1(this);

		return TInters1;
	}

	public TInter removeTInters1(TInter TInters1) {
		getTInters1().remove(TInters1);
		TInters1.setTTechnicien1(null);

		return TInters1;
	}

	public Set<TInter> getTInters2() {
		return this.TInters2;
	}

	public void setTInters2(Set<TInter> TInters2) {
		this.TInters2 = TInters2;
	}

	public TInter addTInters2(TInter TInters2) {
		getTInters2().add(TInters2);
		TInters2.setTTechnicien2(this);

		return TInters2;
	}

	public TInter removeTInters2(TInter TInters2) {
		getTInters2().remove(TInters2);
		TInters2.setTTechnicien2(null);

		return TInters2;
	}

	public TTypetechnicien getTTypetechnicien() {
		return this.TTypetechnicien;
	}

	public void setTTypetechnicien(TTypetechnicien TTypetechnicien) {
		this.TTypetechnicien = TTypetechnicien;
	}

}