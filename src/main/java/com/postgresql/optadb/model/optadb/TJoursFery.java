package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the t_jours_feries database table.
 * 
 */
@Entity
@Table(name="t_jours_feries")
@NamedQuery(name="TJoursFery.findAll", query="SELECT t FROM TJoursFery t")
public class TJoursFery implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_jours_feries")
	private BigInteger idJoursFeries;

	@Column(name="d_ferie")
	private Timestamp dFerie;

	public TJoursFery() {
	}

	public BigInteger getIdJoursFeries() {
		return this.idJoursFeries;
	}

	public void setIdJoursFeries(BigInteger idJoursFeries) {
		this.idJoursFeries = idJoursFeries;
	}

	public Timestamp getDFerie() {
		return this.dFerie;
	}

	public void setDFerie(Timestamp dFerie) {
		this.dFerie = dFerie;
	}

}