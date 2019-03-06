package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;


/**
 * The persistent class for the t_commune_errone database table.
 * 
 */
@Entity
@Table(name="t_commune_errone")
@NamedQuery(name="TCommuneErrone.findAll", query="SELECT t FROM TCommuneErrone t")
public class TCommuneErrone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_commune_errone")
	private String codeCommuneErrone;

	@Column(name="code_commune_correct")
	private String codeCommuneCorrect;

	public TCommuneErrone() {
	}

	public String getCodeCommuneErrone() {
		return this.codeCommuneErrone;
	}

	public void setCodeCommuneErrone(String codeCommuneErrone) {
		this.codeCommuneErrone = codeCommuneErrone;
	}

	public String getCodeCommuneCorrect() {
		return this.codeCommuneCorrect;
	}

	public void setCodeCommuneCorrect(String codeCommuneCorrect) {
		this.codeCommuneCorrect = codeCommuneCorrect;
	}

}