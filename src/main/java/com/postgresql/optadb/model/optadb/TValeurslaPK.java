package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the t_valeursla database table.
 * 
 */
@Embeddable
public class TValeurslaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_parametre", insertable=false, updatable=false)
	private String codeParametre;

	@Column(name="code_sla", insertable=false, updatable=false)
	private String codeSla;

	public TValeurslaPK() {
	}
	public String getCodeParametre() {
		return this.codeParametre;
	}
	public void setCodeParametre(String codeParametre) {
		this.codeParametre = codeParametre;
	}
	public String getCodeSla() {
		return this.codeSla;
	}
	public void setCodeSla(String codeSla) {
		this.codeSla = codeSla;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TValeurslaPK)) {
			return false;
		}
		TValeurslaPK castOther = (TValeurslaPK)other;
		return 
			this.codeParametre.equals(castOther.codeParametre)
			&& this.codeSla.equals(castOther.codeSla);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeParametre.hashCode();
		hash = hash * prime + this.codeSla.hashCode();
		
		return hash;
	}
}