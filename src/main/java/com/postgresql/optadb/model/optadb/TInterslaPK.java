package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * The primary key class for the t_intersla database table.
 * 
 */
@Embeddable
public class TInterslaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="code_sla", insertable=false, updatable=false)
	private String codeSla;

	@Column(name="id_inter", insertable=false, updatable=false)
	private BigDecimal idInter;

	public TInterslaPK() {
	}
	public String getCodeSla() {
		return this.codeSla;
	}
	public void setCodeSla(String codeSla) {
		this.codeSla = codeSla;
	}
	public BigDecimal getIdInter() {
		return this.idInter;
	}
	public void setIdInter(BigDecimal idInter) {
		this.idInter = idInter;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TInterslaPK)) {
			return false;
		}
		TInterslaPK castOther = (TInterslaPK)other;
		return 
			this.codeSla.equals(castOther.codeSla)
			&& (this.idInter == castOther.idInter);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.codeSla.hashCode();
		//hash = hash * prime + ((int) (this.idInter ^ (this.idInter >>> 32)));
		
		return hash;
	}
}