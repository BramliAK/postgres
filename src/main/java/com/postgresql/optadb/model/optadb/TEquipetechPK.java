package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the t_equipetech database table.
 * 
 */
@Embeddable
public class TEquipetechPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_technicienequipe")
	private String codeTechnicienequipe;

	@Column(name="code_technicien")
	private String codeTechnicien;

	public TEquipetechPK() {
	}
	public String getCodeTechnicienequipe() {
		return this.codeTechnicienequipe;
	}
	public void setCodeTechnicienequipe(String codeTechnicienequipe) {
		this.codeTechnicienequipe = codeTechnicienequipe;
	}
	public String getCodeTechnicien() {
		return this.codeTechnicien;
	}
	public void setCodeTechnicien(String codeTechnicien) {
		this.codeTechnicien = codeTechnicien;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TEquipetechPK)) {
			return false;
		}
		TEquipetechPK castOther = (TEquipetechPK)other;
		return 
			this.codeTechnicienequipe.equals(castOther.codeTechnicienequipe)
			&& this.codeTechnicien.equals(castOther.codeTechnicien);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeTechnicienequipe.hashCode();
		hash = hash * prime + this.codeTechnicien.hashCode();
		
		return hash;
	}
}