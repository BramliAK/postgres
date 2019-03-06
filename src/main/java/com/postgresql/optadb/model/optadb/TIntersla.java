package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the t_intersla database table.
 * 
 */
@Entity
@Table(name="t_intersla")
@NamedQuery(name="TIntersla.findAll", query="SELECT t FROM TIntersla t")
public class TIntersla implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TInterslaPK id;

	@Column(name="dh_debut")
	private Timestamp dhDebut;

	@Column(name="dh_fin")
	private Timestamp dhFin;

	//bi-directional many-to-one association to TInter
	@ManyToOne
	@JoinColumn(name="id_inter",insertable = false, updatable = false)
	private TInter TInter;

	//bi-directional many-to-one association to TSla
	@ManyToOne
	@JoinColumn(name="code_sla",insertable = false, updatable = false
	)
	private TSla TSla;

	public TIntersla() {
	}

	public TInterslaPK getId() {
		return this.id;
	}

	public void setId(TInterslaPK id) {
		this.id = id;
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

	public TInter getTInter() {
		return this.TInter;
	}

	public void setTInter(TInter TInter) {
		this.TInter = TInter;
	}

	public TSla getTSla() {
		return this.TSla;
	}

	public void setTSla(TSla TSla) {
		this.TSla = TSla;
	}

}