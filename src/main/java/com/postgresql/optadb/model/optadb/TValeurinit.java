package com.postgresql.optadb.model.optadb;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the t_valeurinit database table.
 * 
 */
@Entity
@Table(name="t_valeurinit")
@NamedQuery(name="TValeurinit.findAll", query="SELECT t FROM TValeurinit t")
public class TValeurinit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String discriminant;

	private String valeur;

	public TValeurinit() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDiscriminant() {
		return this.discriminant;
	}

	public void setDiscriminant(String discriminant) {
		this.discriminant = discriminant;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

}