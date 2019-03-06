package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the t_valeurtechnicien database table.
 * 
 */
@Embeddable
public class TValeurtechnicienPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_technicien")
	private String codeTechnicien;

	@Column(name="code_parametre", insertable=false, updatable=false)
	private String codeParametre;

	public TValeurtechnicienPK() {
	}
	public String getCodeTechnicien() {
		return this.codeTechnicien;
	}
	public void setCodeTechnicien(String codeTechnicien) {
		this.codeTechnicien = codeTechnicien;
	}
	public String getCodeParametre() {
		return this.codeParametre;
	}
	public void setCodeParametre(String codeParametre) {
		this.codeParametre = codeParametre;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TValeurtechnicienPK)) {
			return false;
		}
		TValeurtechnicienPK castOther = (TValeurtechnicienPK)other;
		return 
			this.codeTechnicien.equals(castOther.codeTechnicien)
			&& this.codeParametre.equals(castOther.codeParametre);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeTechnicien.hashCode();
		hash = hash * prime + this.codeParametre.hashCode();
		
		return hash;
	}
}