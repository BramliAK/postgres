package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_parametre database table.
 * 
 */
@Entity
@Table(name="t_parametre")
@NamedQuery(name="TParametre.findAll", query="SELECT t FROM TParametre t")
public class TParametre implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_parametre")
	private String codeParametre;

	private String nom;

	@Column(name="num_ordre")
	private short numOrdre;

	private String type;

	//bi-directional many-to-one association to TValeursla
	@OneToMany(mappedBy="TParametre")
	private Set<TValeursla> TValeurslas;

	//bi-directional many-to-one association to TValeurtechnicien
	@OneToMany(mappedBy="TParametre")
	private Set<TValeurtechnicien> TValeurtechniciens;

	//bi-directional many-to-one association to TValeurtypetech
	@OneToMany(mappedBy="TParametre")
	private Set<TValeurtypetech> TValeurtypeteches;

	public TParametre() {
	}

	public String getCodeParametre() {
		return this.codeParametre;
	}

	public void setCodeParametre(String codeParametre) {
		this.codeParametre = codeParametre;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public short getNumOrdre() {
		return this.numOrdre;
	}

	public void setNumOrdre(short numOrdre) {
		this.numOrdre = numOrdre;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Set<TValeursla> getTValeurslas() {
		return this.TValeurslas;
	}

	public void setTValeurslas(Set<TValeursla> TValeurslas) {
		this.TValeurslas = TValeurslas;
	}

	public TValeursla addTValeursla(TValeursla TValeursla) {
		getTValeurslas().add(TValeursla);
		TValeursla.setTParametre(this);

		return TValeursla;
	}

	public TValeursla removeTValeursla(TValeursla TValeursla) {
		getTValeurslas().remove(TValeursla);
		TValeursla.setTParametre(null);

		return TValeursla;
	}

	public Set<TValeurtechnicien> getTValeurtechniciens() {
		return this.TValeurtechniciens;
	}

	public void setTValeurtechniciens(Set<TValeurtechnicien> TValeurtechniciens) {
		this.TValeurtechniciens = TValeurtechniciens;
	}

	public TValeurtechnicien addTValeurtechnicien(TValeurtechnicien TValeurtechnicien) {
		getTValeurtechniciens().add(TValeurtechnicien);
		TValeurtechnicien.setTParametre(this);

		return TValeurtechnicien;
	}

	public TValeurtechnicien removeTValeurtechnicien(TValeurtechnicien TValeurtechnicien) {
		getTValeurtechniciens().remove(TValeurtechnicien);
		TValeurtechnicien.setTParametre(null);

		return TValeurtechnicien;
	}

	public Set<TValeurtypetech> getTValeurtypeteches() {
		return this.TValeurtypeteches;
	}

	public void setTValeurtypeteches(Set<TValeurtypetech> TValeurtypeteches) {
		this.TValeurtypeteches = TValeurtypeteches;
	}

	public TValeurtypetech addTValeurtypetech(TValeurtypetech TValeurtypetech) {
		getTValeurtypeteches().add(TValeurtypetech);
		TValeurtypetech.setTParametre(this);

		return TValeurtypetech;
	}

	public TValeurtypetech removeTValeurtypetech(TValeurtypetech TValeurtypetech) {
		getTValeurtypeteches().remove(TValeurtypetech);
		TValeurtypetech.setTParametre(null);

		return TValeurtypetech;
	}

}