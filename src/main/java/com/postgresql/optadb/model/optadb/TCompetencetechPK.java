package com.postgresql.optadb.model.optadb;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * The primary key class for the t_competencetech database table.
 * 
 */
@Embeddable
public class TCompetencetechPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="id_technicien", insertable=false, updatable=false)
	private Long idTechnicien;

	@Column(name="code_competence", insertable=false, updatable=false)
	private String codeCompetence;

	public TCompetencetechPK() {
	}
	public Long getIdTechnicien() {
		return this.idTechnicien;
	}
	public void setIdTechnicien(Long idTechnicien) {
		this.idTechnicien = idTechnicien;
	}
	public String getCodeCompetence() {
		return this.codeCompetence;
	}
	public void setCodeCompetence(String codeCompetence) {
		this.codeCompetence = codeCompetence;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TCompetencetechPK)) {
			return false;
		}
		TCompetencetechPK castOther = (TCompetencetechPK)other;
		return 
			this.idTechnicien.equals(castOther.idTechnicien)
			&& this.codeCompetence.equals(castOther.codeCompetence);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idTechnicien.hashCode();
		hash = hash * prime + this.codeCompetence.hashCode();
		
		return hash;
	}
}