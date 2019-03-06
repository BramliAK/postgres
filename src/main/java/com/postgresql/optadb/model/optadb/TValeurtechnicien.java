package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the t_valeurtechnicien database table.
 * 
 */
@Entity
@Table(name="t_valeurtechnicien")
@NamedQuery(name="TValeurtechnicien.findAll", query="SELECT t FROM TValeurtechnicien t")
public class TValeurtechnicien implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TValeurtechnicienPK id;

	private BigDecimal valeur;

	//bi-directional many-to-one association to TParametre
	@ManyToOne
	@JoinColumn(name="code_parametre",insertable = false, updatable = false)
	private TParametre TParametre;

	public TValeurtechnicien() {
	}

	public TValeurtechnicienPK getId() {
		return this.id;
	}

	public void setId(TValeurtechnicienPK id) {
		this.id = id;
	}

	public BigDecimal getValeur() {
		return this.valeur;
	}

	public void setValeur(BigDecimal valeur) {
		this.valeur = valeur;
	}

	public TParametre getTParametre() {
		return this.TParametre;
	}

	public void setTParametre(TParametre TParametre) {
		this.TParametre = TParametre;
	}

}