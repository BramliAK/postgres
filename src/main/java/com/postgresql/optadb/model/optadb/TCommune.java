package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the t_commune database table.
 * 
 */
@Entity
@Table(name="t_commune")
@NamedQuery(name="TCommune.findAll", query="SELECT t FROM TCommune t")
public class TCommune implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_commune")
	private String codeCommune;

	@Column(name="nom_commune")
	private String nomCommune;

	//bi-directional many-to-one association to TSecteur
	@ManyToOne
	@JoinColumn(name="code_secteur")
	private TSecteur TSecteur;

	public TCommune() {
	}

	public String getCodeCommune() {
		return this.codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getNomCommune() {
		return this.nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public TSecteur getTSecteur() {
		return this.TSecteur;
	}

	public void setTSecteur(TSecteur TSecteur) {
		this.TSecteur = TSecteur;
	}

}