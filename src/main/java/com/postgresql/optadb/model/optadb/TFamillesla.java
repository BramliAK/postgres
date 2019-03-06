package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_famillesla database table.
 * 
 */
@Entity
@Table(name="t_famillesla")
@NamedQuery(name="TFamillesla.findAll", query="SELECT t FROM TFamillesla t")
public class TFamillesla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_famillesla")
	private String codeFamillesla;

	private String nom;

	//bi-directional many-to-one association to TSla
	@OneToMany(mappedBy="TFamillesla")
	private Set<TSla> TSlas;

	public TFamillesla() {
	}

	public String getCodeFamillesla() {
		return this.codeFamillesla;
	}

	public void setCodeFamillesla(String codeFamillesla) {
		this.codeFamillesla = codeFamillesla;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<TSla> getTSlas() {
		return this.TSlas;
	}

	public void setTSlas(Set<TSla> TSlas) {
		this.TSlas = TSlas;
	}

	public TSla addTSla(TSla TSla) {
		getTSlas().add(TSla);
		TSla.setTFamillesla(this);

		return TSla;
	}

	public TSla removeTSla(TSla TSla) {
		getTSlas().remove(TSla);
		TSla.setTFamillesla(null);

		return TSla;
	}

}