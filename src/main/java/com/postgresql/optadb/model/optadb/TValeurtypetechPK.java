package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the t_valeurtypetech database table.
 * 
 */
@Embeddable
public class TValeurtypetechPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_typetech", insertable=false, updatable=false)
	private String codeTypetech;

	@Column(name="code_parametre", insertable=false, updatable=false)
	private String codeParametre;

	public TValeurtypetechPK() {
	}
	public String getCodeTypetech() {
		return this.codeTypetech;
	}
	public void setCodeTypetech(String codeTypetech) {
		this.codeTypetech = codeTypetech;
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
		if (!(other instanceof TValeurtypetechPK)) {
			return false;
		}
		TValeurtypetechPK castOther = (TValeurtypetechPK)other;
		return 
			this.codeTypetech.equals(castOther.codeTypetech)
			&& this.codeParametre.equals(castOther.codeParametre);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeTypetech.hashCode();
		hash = hash * prime + this.codeParametre.hashCode();
		
		return hash;
	}
}