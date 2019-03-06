package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_secteur database table.
 * 
 */
@Entity
@Table(name="t_secteur")
@NamedQuery(name="TSecteur.findAll", query="SELECT t FROM TSecteur t")
public class TSecteur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_secteur")
	private String codeSecteur;

	private String nom;

	@Column(name="secto_backup")
	private short sectoBackup;

	private short sectorisation;

	//bi-directional many-to-one association to TCommune
	@OneToMany(mappedBy="TSecteur")
	private Set<TCommune> TCommunes;

	//bi-directional many-to-one association to TCrise
	@OneToMany(mappedBy="TSecteur")
	private Set<TCrise> TCrises;

	//bi-directional many-to-one association to TDisponibilite
	@OneToMany(mappedBy="TSecteur")
	private Set<TDisponibilite> TDisponibilites;

	//bi-directional many-to-one association to TInter
	@OneToMany(mappedBy="TSecteur")
	private Set<TInter> TInters;

	//bi-directional many-to-one association to TInterBloquee
	@OneToMany(mappedBy="TSecteur")
	private Set<TInterBloquee> TInterBloquees;

	public TSecteur() {
	}

	public String getCodeSecteur() {
		return this.codeSecteur;
	}

	public void setCodeSecteur(String codeSecteur) {
		this.codeSecteur = codeSecteur;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public short getSectoBackup() {
		return this.sectoBackup;
	}

	public void setSectoBackup(short sectoBackup) {
		this.sectoBackup = sectoBackup;
	}

	public short getSectorisation() {
		return this.sectorisation;
	}

	public void setSectorisation(short sectorisation) {
		this.sectorisation = sectorisation;
	}

	public Set<TCommune> getTCommunes() {
		return this.TCommunes;
	}

	public void setTCommunes(Set<TCommune> TCommunes) {
		this.TCommunes = TCommunes;
	}

	public TCommune addTCommune(TCommune TCommune) {
		getTCommunes().add(TCommune);
		TCommune.setTSecteur(this);

		return TCommune;
	}

	public TCommune removeTCommune(TCommune TCommune) {
		getTCommunes().remove(TCommune);
		TCommune.setTSecteur(null);

		return TCommune;
	}

	public Set<TCrise> getTCrises() {
		return this.TCrises;
	}

	public void setTCrises(Set<TCrise> TCrises) {
		this.TCrises = TCrises;
	}

	public TCrise addTCris(TCrise TCris) {
		getTCrises().add(TCris);
		TCris.setTSecteur(this);

		return TCris;
	}

	public TCrise removeTCris(TCrise TCris) {
		getTCrises().remove(TCris);
		TCris.setTSecteur(null);

		return TCris;
	}

	public Set<TDisponibilite> getTDisponibilites() {
		return this.TDisponibilites;
	}

	public void setTDisponibilites(Set<TDisponibilite> TDisponibilites) {
		this.TDisponibilites = TDisponibilites;
	}

	public TDisponibilite addTDisponibilite(TDisponibilite TDisponibilite) {
		getTDisponibilites().add(TDisponibilite);
		TDisponibilite.setTSecteur(this);

		return TDisponibilite;
	}

	public TDisponibilite removeTDisponibilite(TDisponibilite TDisponibilite) {
		getTDisponibilites().remove(TDisponibilite);
		TDisponibilite.setTSecteur(null);

		return TDisponibilite;
	}

	public Set<TInter> getTInters() {
		return this.TInters;
	}

	public void setTInters(Set<TInter> TInters) {
		this.TInters = TInters;
	}

	public TInter addTInter(TInter TInter) {
		getTInters().add(TInter);
		TInter.setTSecteur(this);

		return TInter;
	}

	public TInter removeTInter(TInter TInter) {
		getTInters().remove(TInter);
		TInter.setTSecteur(null);

		return TInter;
	}

	public Set<TInterBloquee> getTInterBloquees() {
		return this.TInterBloquees;
	}

	public void setTInterBloquees(Set<TInterBloquee> TInterBloquees) {
		this.TInterBloquees = TInterBloquees;
	}

	public TInterBloquee addTInterBloquee(TInterBloquee TInterBloquee) {
		getTInterBloquees().add(TInterBloquee);
		TInterBloquee.setTSecteur(this);

		return TInterBloquee;
	}

	public TInterBloquee removeTInterBloquee(TInterBloquee TInterBloquee) {
		getTInterBloquees().remove(TInterBloquee);
		TInterBloquee.setTSecteur(null);

		return TInterBloquee;
	}

}