package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the t_modele database table.
 * 
 */
@Entity
@Table(name="t_modele")
@NamedQuery(name="TModele.findAll", query="SELECT t FROM TModele t")
public class TModele implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_modele")
	private BigInteger idModele;

	@Column(name="dh_creation")
	private Timestamp dhCreation;

	private String nom;

	//bi-directional many-to-one association to TCrise
	@OneToMany(mappedBy="TModele")
	private Set<TCrise> TCrises;

	//bi-directional many-to-one association to TInter
	@OneToMany(mappedBy="TModele")
	private Set<TInter> TInters;

	//bi-directional many-to-one association to TSla
	@OneToMany(mappedBy="TModele")
	private Set<TSla> TSlas;

	public TModele() {
	}

	public BigInteger getIdModele() {
		return this.idModele;
	}

	public void setIdModele(BigInteger idModele) {
		this.idModele = idModele;
	}

	public Timestamp getDhCreation() {
		return this.dhCreation;
	}

	public void setDhCreation(Timestamp dhCreation) {
		this.dhCreation = dhCreation;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<TCrise> getTCrises() {
		return this.TCrises;
	}

	public void setTCrises(Set<TCrise> TCrises) {
		this.TCrises = TCrises;
	}

	public TCrise addTCris(TCrise TCris) {
		getTCrises().add(TCris);
		TCris.setTModele(this);

		return TCris;
	}

	public TCrise removeTCris(TCrise TCris) {
		getTCrises().remove(TCris);
		TCris.setTModele(null);

		return TCris;
	}

	public Set<TInter> getTInters() {
		return this.TInters;
	}

	public void setTInters(Set<TInter> TInters) {
		this.TInters = TInters;
	}

	public TInter addTInter(TInter TInter) {
		getTInters().add(TInter);
		TInter.setTModele(this);

		return TInter;
	}

	public TInter removeTInter(TInter TInter) {
		getTInters().remove(TInter);
		TInter.setTModele(null);

		return TInter;
	}

	public Set<TSla> getTSlas() {
		return this.TSlas;
	}

	public void setTSlas(Set<TSla> TSlas) {
		this.TSlas = TSlas;
	}

	public TSla addTSla(TSla TSla) {
		getTSlas().add(TSla);
		TSla.setTModele(this);

		return TSla;
	}

	public TSla removeTSla(TSla TSla) {
		getTSlas().remove(TSla);
		TSla.setTModele(null);

		return TSla;
	}

}