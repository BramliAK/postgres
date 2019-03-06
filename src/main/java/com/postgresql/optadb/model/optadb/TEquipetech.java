package com.postgresql.optadb.model.optadb;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * The persistent class for the t_equipetech database table.
 * 
 */
@Entity
@Table(name="t_equipetech")
@NamedQuery(name="TEquipetech.findAll", query="SELECT t FROM TEquipetech t")
public class TEquipetech implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TEquipetechPK id;

	public TEquipetech() {
	}

	public TEquipetechPK getId() {
		return this.id;
	}

	public void setId(TEquipetechPK id) {
		this.id = id;
	}

}