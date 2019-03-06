package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_crise database table.
 * 
 */
@Entity
@Table(name="t_crise")
@NamedQuery(name="TCrise.findAll", query="SELECT t FROM TCrise t")
public class TCrise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_crise")
	private BigDecimal idCrise;

	private short actif;

	@Column(name="dh_creation")
	private Timestamp dhCreation;

	@Column(name="dh_debut")
	private Timestamp dhDebut;

	@Column(name="dh_fin")
	private Timestamp dhFin;

	private String nom;

	//bi-directional many-to-one association to TModele
	@ManyToOne
	@JoinColumn(name="id_modele",insertable = false, updatable = false)
	private TModele TModele;

	//bi-directional many-to-one association to TSecteur
	@ManyToOne
	@JoinColumn(name="code_secteur",insertable = false, updatable = false)
	private TSecteur TSecteur;

	public TCrise() {
	}

	public BigDecimal getIdCrise() {
		return this.idCrise;
	}

	public void setIdCrise(BigDecimal idCrise) {
		this.idCrise = idCrise;
	}

	public short getActif() {
		return this.actif;
	}

	public void setActif(short actif) {
		this.actif = actif;
	}

	public Timestamp getDhCreation() {
		return this.dhCreation;
	}

	public void setDhCreation(Timestamp dhCreation) {
		this.dhCreation = dhCreation;
	}

	public Timestamp getDhDebut() {
		return this.dhDebut;
	}

	public void setDhDebut(Timestamp dhDebut) {
		this.dhDebut = dhDebut;
	}

	public Timestamp getDhFin() {
		return this.dhFin;
	}

	public void setDhFin(Timestamp dhFin) {
		this.dhFin = dhFin;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TModele getTModele() {
		return this.TModele;
	}

	public void setTModele(TModele TModele) {
		this.TModele = TModele;
	}

	public TSecteur getTSecteur() {
		return this.TSecteur;
	}

	public void setTSecteur(TSecteur TSecteur) {
		this.TSecteur = TSecteur;
	}

}