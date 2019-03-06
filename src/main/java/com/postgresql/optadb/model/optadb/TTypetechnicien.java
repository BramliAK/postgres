package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_typetechnicien database table.
 * 
 */
@Entity
@Table(name="t_typetechnicien")
@NamedQuery(name="TTypetechnicien.findAll", query="SELECT t FROM TTypetechnicien t")
public class TTypetechnicien implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_typetech")
	private String codeTypetech;

	private String nom;

	//bi-directional many-to-one association to TTechnicien
	@OneToMany(mappedBy="TTypetechnicien")
	private Set<TTechnicien> TTechniciens;

	//bi-directional many-to-one association to TValeurtypetech
	@OneToMany(mappedBy="TTypetechnicien")
	private Set<TValeurtypetech> TValeurtypeteches;

	public TTypetechnicien() {
	}

	public String getCodeTypetech() {
		return this.codeTypetech;
	}

	public void setCodeTypetech(String codeTypetech) {
		this.codeTypetech = codeTypetech;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<TTechnicien> getTTechniciens() {
		return this.TTechniciens;
	}

	public void setTTechniciens(Set<TTechnicien> TTechniciens) {
		this.TTechniciens = TTechniciens;
	}

	public TTechnicien addTTechnicien(TTechnicien TTechnicien) {
		getTTechniciens().add(TTechnicien);
		TTechnicien.setTTypetechnicien(this);

		return TTechnicien;
	}

	public TTechnicien removeTTechnicien(TTechnicien TTechnicien) {
		getTTechniciens().remove(TTechnicien);
		TTechnicien.setTTypetechnicien(null);

		return TTechnicien;
	}

	public Set<TValeurtypetech> getTValeurtypeteches() {
		return this.TValeurtypeteches;
	}

	public void setTValeurtypeteches(Set<TValeurtypetech> TValeurtypeteches) {
		this.TValeurtypeteches = TValeurtypeteches;
	}

	public TValeurtypetech addTValeurtypetech(TValeurtypetech TValeurtypetech) {
		getTValeurtypeteches().add(TValeurtypetech);
		TValeurtypetech.setTTypetechnicien(this);

		return TValeurtypetech;
	}

	public TValeurtypetech removeTValeurtypetech(TValeurtypetech TValeurtypetech) {
		getTValeurtypeteches().remove(TValeurtypetech);
		TValeurtypetech.setTTypetechnicien(null);

		return TValeurtypetech;
	}

}