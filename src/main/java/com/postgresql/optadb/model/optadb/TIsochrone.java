package com.postgresql.optadb.model.optadb;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the t_isochrone database table.
 * 
 */
@Entity
@Table(name="t_isochrone")
@NamedQuery(name="TIsochrone.findAll", query="SELECT t FROM TIsochrone t")
public class TIsochrone implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TIsochronePK id;

	private String sommets;

	public TIsochrone() {
	}

	public TIsochronePK getId() {
		return this.id;
	}

	public void setId(TIsochronePK id) {
		this.id = id;
	}

	public String getSommets() {
		return this.sommets;
	}

	public void setSommets(String sommets) {
		this.sommets = sommets;
	}

}