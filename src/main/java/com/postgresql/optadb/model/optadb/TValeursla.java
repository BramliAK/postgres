package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the t_valeursla database table.
 * 
 */
@Entity
@Table(name="t_valeursla")
@NamedQuery(name="TValeursla.findAll", query="SELECT t FROM TValeursla t")
public class TValeursla implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TValeurslaPK id;

	private String valeur;

	//bi-directional many-to-one association to TParametre
	@ManyToOne
	@JoinColumn(name="code_parametre",insertable = false, updatable = false)
	private TParametre TParametre;

	//bi-directional many-to-one association to TSla
	@ManyToOne
	@JoinColumn(name="code_sla",insertable = false, updatable = false)
	private TSla TSla;

	public TValeursla() {
	}

	public TValeurslaPK getId() {
		return this.id;
	}

	public void setId(TValeurslaPK id) {
		this.id = id;
	}

	public String getValeur() {
		return this.valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public TParametre getTParametre() {
		return this.TParametre;
	}

	public void setTParametre(TParametre TParametre) {
		this.TParametre = TParametre;
	}

	public TSla getTSla() {
		return this.TSla;
	}

	public void setTSla(TSla TSla) {
		this.TSla = TSla;
	}

}