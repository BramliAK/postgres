package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;


/**
 * The persistent class for the t_adresse database table.
 * 
 */
@Entity
@Table(name="t_adresse")
@NamedQuery(name="TAdresse.findAll", query="SELECT t FROM TAdresse t")
public class TAdresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_adresse")
	private BigDecimal idAdresse;

	private String adresse;

	private String cle;

	@Column(name="code_commune")
	private String codeCommune;

	private String codevoie;

	private  short in360;

	@Column(name="nom_commune")
	private String nomCommune;

	//bi-directional many-to-one association to TGeocode
	@ManyToOne
	@JoinColumn(name="id_geocode")
	private TGeocode TGeocode;

	//bi-directional many-to-one association to TDisponibilite
	@OneToMany(mappedBy="TAdresse1")
	private Set<TDisponibilite> TDisponibilites1;

	//bi-directional many-to-one association to TDisponibilite
	@OneToMany(mappedBy="TAdresse2")
	private Set<TDisponibilite> TDisponibilites2;

	//bi-directional many-to-one association to TEquipement
	@OneToMany(mappedBy="TAdresse")
	private Set<TEquipement> TEquipements;

	//bi-directional many-to-one association to TInter
	@OneToMany(mappedBy="TAdresse")
	private Set<TInter> TInters;

	//bi-directional many-to-one association to TInterBloquee
	@OneToMany(mappedBy="TAdresse")
	private Set<TInterBloquee> TInterBloquees;

	public TAdresse() {
	}

	public BigDecimal getIdAdresse() {
		return this.idAdresse;
	}

	public void setIdAdresse(BigDecimal idAdresse) {
		this.idAdresse = idAdresse;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCle() {
		return this.cle;
	}

	public void setCle(String cle) {
		this.cle = cle;
	}

	public String getCodeCommune() {
		return this.codeCommune;
	}

	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	public String getCodevoie() {
		return this.codevoie;
	}

	public void setCodevoie(String codevoie) {
		this.codevoie = codevoie;
	}

	public short getIn360() {
		return this.in360;
	}

	public void setIn360(short in360) {
		this.in360 = in360;
	}

	public String getNomCommune() {
		return this.nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public TGeocode getTGeocode() {
		return this.TGeocode;
	}

	public void setTGeocode(TGeocode TGeocode) {
		this.TGeocode = TGeocode;
	}

	public Set<TDisponibilite> getTDisponibilites1() {
		return this.TDisponibilites1;
	}

	public void setTDisponibilites1(Set<TDisponibilite> TDisponibilites1) {
		this.TDisponibilites1 = TDisponibilites1;
	}

	public TDisponibilite addTDisponibilites1(TDisponibilite TDisponibilites1) {
		getTDisponibilites1().add(TDisponibilites1);
		TDisponibilites1.setTAdresse1(this);

		return TDisponibilites1;
	}

	public TDisponibilite removeTDisponibilites1(TDisponibilite TDisponibilites1) {
		getTDisponibilites1().remove(TDisponibilites1);
		TDisponibilites1.setTAdresse1(null);

		return TDisponibilites1;
	}

	public Set<TDisponibilite> getTDisponibilites2() {
		return this.TDisponibilites2;
	}

	public void setTDisponibilites2(Set<TDisponibilite> TDisponibilites2) {
		this.TDisponibilites2 = TDisponibilites2;
	}

	public TDisponibilite addTDisponibilites2(TDisponibilite TDisponibilites2) {
		getTDisponibilites2().add(TDisponibilites2);
		TDisponibilites2.setTAdresse2(this);

		return TDisponibilites2;
	}

	public TDisponibilite removeTDisponibilites2(TDisponibilite TDisponibilites2) {
		getTDisponibilites2().remove(TDisponibilites2);
		TDisponibilites2.setTAdresse2(null);

		return TDisponibilites2;
	}

	public Set<TEquipement> getTEquipements() {
		return this.TEquipements;
	}

	public void setTEquipements(Set<TEquipement> TEquipements) {
		this.TEquipements = TEquipements;
	}

	public TEquipement addTEquipement(TEquipement TEquipement) {
		getTEquipements().add(TEquipement);
		TEquipement.setTAdresse(this);

		return TEquipement;
	}

	public TEquipement removeTEquipement(TEquipement TEquipement) {
		getTEquipements().remove(TEquipement);
		TEquipement.setTAdresse(null);

		return TEquipement;
	}

	public Set<TInter> getTInters() {
		return this.TInters;
	}

	public void setTInters(Set<TInter> TInters) {
		this.TInters = TInters;
	}

	public TInter addTInter(TInter TInter) {
		getTInters().add(TInter);
		TInter.setTAdresse(this);

		return TInter;
	}

	public TInter removeTInter(TInter TInter) {
		getTInters().remove(TInter);
		TInter.setTAdresse(null);

		return TInter;
	}

	public Set<TInterBloquee> getTInterBloquees() {
		return this.TInterBloquees;
	}

	public void setTInterBloquees(Set<TInterBloquee> TInterBloquees) {
		this.TInterBloquees = TInterBloquees;
	}

	public TInterBloquee addTInterBloquee(TInterBloquee TInterBloquee) {
		getTInterBloquees().add(TInterBloquee);
		TInterBloquee.setTAdresse(this);

		return TInterBloquee;
	}

	public TInterBloquee removeTInterBloquee(TInterBloquee TInterBloquee) {
		getTInterBloquees().remove(TInterBloquee);
		TInterBloquee.setTAdresse(null);

		return TInterBloquee;
	}

}