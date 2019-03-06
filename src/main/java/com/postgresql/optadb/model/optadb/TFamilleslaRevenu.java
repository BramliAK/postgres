package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;


/**
 * The persistent class for the t_famillesla_revenu database table.
 * 
 */
@Entity
@Table(name="t_famillesla_revenu")
@NamedQuery(name="TFamilleslaRevenu.findAll", query="SELECT t FROM TFamilleslaRevenu t")
public class TFamilleslaRevenu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_famillesla_revenu")
	private BigInteger idFamilleslaRevenu;

	@Column(name="code_famillesla")
	private String codeFamillesla;

	@Column(name="code_groupe")
	private String codeGroupe;

	private String modificateur;

	private String valeur;

	public TFamilleslaRevenu() {
	}

	public BigInteger getIdFamilleslaRevenu() {
		return this.idFamilleslaRevenu;
	}

	public void setIdFamilleslaRevenu(BigInteger idFamilleslaRevenu) {
		this.idFamilleslaRevenu = idFamilleslaRevenu;
	}

	public String getCodeFamillesla() {
		return this.codeFamillesla;
	}

	public void setCodeFamillesla(String codeFamillesla) {
		this.codeFamillesla = codeFamillesla;
	}

	public String getCodeGroupe() {
		return this.codeGroupe;
	}

	public void setCodeGroupe(String codeGroupe) {
		this.codeGroupe = codeGroupe;
	}

	public String getModificateur() {
		return this.modificateur;
	}

	public void setModificateur(String modificateur) {
		this.modificateur = modificateur;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}