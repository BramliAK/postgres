package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the t_inter_bloquee database table.
 * 
 */
@Entity
@Table(name="t_inter_bloquee")
@NamedQuery(name="TInterBloquee.findAll", query="SELECT t FROM TInterBloquee t")
public class TInterBloquee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_inter_bloquee")
	private BigInteger idInterBloquee;

	private String activite;

	private short blocagehoraire;

	private short blocageresource;

	@Column(name="code_competence")
	private String codeCompetence;

	private String codeorigine;

	@Column(name="d_affectation")
	private Timestamp dAffectation;

	@Column(name="d_contractuelle")
	private Timestamp dContractuelle;

	@Column(name="d_rdv")
	private Timestamp dRdv;

	@Column(name="dh_creation_optim")
	private Timestamp dhCreationOptim;

	@Column(name="dh_debut")
	private Timestamp dhDebut;

	@Column(name="dh_fin")
	private Timestamp dhFin;

	@Column(name="dh_forcage_par_anticipation")
	private Timestamp dhForcageParAnticipation;

	@Column(name="dh_forcage_rdv")
	private Timestamp dhForcageRdv;

	@Column(name="distance_trajet")
	private BigDecimal distanceTrajet;

	private String duration;

	@Column(name="duration_trajet")
	private String durationTrajet;

	private String engagement;

	@Column(name="h_affectation_deb")
	private String hAffectationDeb;

	@Column(name="h_affectation_fin")
	private String hAffectationFin;

	@Column(name="h_contractuelle")
	private String hContractuelle;

	@Column(name="h_rdv")
	private String hRdv;

	@Column(name="id_inter_renforcee")
	private BigDecimal idInterRenforcee;

	@Column(name="id_modele")
	private BigDecimal idModele;

	@Column(name="id_technicien")
	private BigDecimal idTechnicien;

	@Column(name="id_technicien_apres_optim")
	private Long idTechnicienApresOptim;

	private short in360;

	@Column(name="inputrefid_pdc")
	private String inputrefidPdc;

	@Column(name="last_technicien_planifie")
	private String lastTechnicienPlanifie;

	@Column(name="list_inter_voisine")
	private String listInterVoisine;

	private String marge;

	@Column(name="nb_di")
	private Integer nbDi;

	@Column(name="nb_jrt_pose")
	private Integer nbJrtPose;

	private String numint;

	private String produit;

	private String refint;

	private String segment;

	private String status;

	private String statutoptim;

	@Column(name="ts_creation_inter")
	private Timestamp tsCreationInter;

	private String typerdv;

	//bi-directional many-to-one association to TAdresse
	@ManyToOne
	@JoinColumn(name="id_adresse")
	private TAdresse TAdresse;

	//bi-directional many-to-many association to TCompetence
	@ManyToMany
	@JoinTable(
		name="t_competenceinter_bloquee"
		, joinColumns={
			@JoinColumn(name="id_inter_bloquee")
			}
		, inverseJoinColumns={
			@JoinColumn(name="code_competence")
			}
		)
	private Set<TCompetence> TCompetences;

	//bi-directional many-to-one association to TSecteur
	@ManyToOne
	@JoinColumn(name="code_secteur")
	private TSecteur TSecteur;

	public TInterBloquee() {
	}

	public BigInteger getIdInterBloquee() {
		return this.idInterBloquee;
	}

	public void setIdInterBloquee(BigInteger idInterBloquee) {
		this.idInterBloquee = idInterBloquee;
	}

	public String getActivite() {
		return this.activite;
	}

	public void setActivite(String activite) {
		this.activite = activite;
	}

	public short getBlocagehoraire() {
		return this.blocagehoraire;
	}

	public void setBlocagehoraire(short blocagehoraire) {
		this.blocagehoraire = blocagehoraire;
	}

	public short getBlocageresource() {
		return this.blocageresource;
	}

	public void setBlocageresource(short blocageresource) {
		this.blocageresource = blocageresource;
	}

	public String getCodeCompetence() {
		return this.codeCompetence;
	}

	public void setCodeCompetence(String codeCompetence) {
		this.codeCompetence = codeCompetence;
	}

	public String getCodeorigine() {
		return this.codeorigine;
	}

	public void setCodeorigine(String codeorigine) {
		this.codeorigine = codeorigine;
	}

	public Timestamp getDAffectation() {
		return this.dAffectation;
	}

	public void setDAffectation(Timestamp dAffectation) {
		this.dAffectation = dAffectation;
	}

	public Timestamp getDContractuelle() {
		return this.dContractuelle;
	}

	public void setDContractuelle(Timestamp dContractuelle) {
		this.dContractuelle = dContractuelle;
	}

	public Timestamp getDRdv() {
		return this.dRdv;
	}

	public void setDRdv(Timestamp dRdv) {
		this.dRdv = dRdv;
	}

	public Timestamp getDhCreationOptim() {
		return this.dhCreationOptim;
	}

	public void setDhCreationOptim(Timestamp dhCreationOptim) {
		this.dhCreationOptim = dhCreationOptim;
	}

	public Timestamp getDhDebut() {
		return this.dhDebut;
	}

	public void setDhDebut(Timestamp dhDebut) {
		this.dhDebut = dhDebut;
	}

	public Timestamp getDhFin() {
		return this.dhFin;
	}

	public void setDhFin(Timestamp dhFin) {
		this.dhFin = dhFin;
	}

	public Timestamp getDhForcageParAnticipation() {
		return this.dhForcageParAnticipation;
	}

	public void setDhForcageParAnticipation(Timestamp dhForcageParAnticipation) {
		this.dhForcageParAnticipation = dhForcageParAnticipation;
	}

	public Timestamp getDhForcageRdv() {
		return this.dhForcageRdv;
	}

	public void setDhForcageRdv(Timestamp dhForcageRdv) {
		this.dhForcageRdv = dhForcageRdv;
	}

	public BigDecimal getDistanceTrajet() {
		return this.distanceTrajet;
	}

	public void setDistanceTrajet(BigDecimal distanceTrajet) {
		this.distanceTrajet = distanceTrajet;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDurationTrajet() {
		return this.durationTrajet;
	}

	public void setDurationTrajet(String durationTrajet) {
		this.durationTrajet = durationTrajet;
	}

	public String getEngagement() {
		return this.engagement;
	}

	public void setEngagement(String engagement) {
		this.engagement = engagement;
	}

	public String getHAffectationDeb() {
		return this.hAffectationDeb;
	}

	public void setHAffectationDeb(String hAffectationDeb) {
		this.hAffectationDeb = hAffectationDeb;
	}

	public String getHAffectationFin() {
		return this.hAffectationFin;
	}

	public void setHAffectationFin(String hAffectationFin) {
		this.hAffectationFin = hAffectationFin;
	}

	public String getHContractuelle() {
		return this.hContractuelle;
	}

	public void setHContractuelle(String hContractuelle) {
		this.hContractuelle = hContractuelle;
	}

	public String getHRdv() {
		return this.hRdv;
	}

	public void setHRdv(String hRdv) {
		this.hRdv = hRdv;
	}

	public BigDecimal getIdInterRenforcee() {
		return this.idInterRenforcee;
	}

	public void setIdInterRenforcee(BigDecimal idInterRenforcee) {
		this.idInterRenforcee = idInterRenforcee;
	}

	public BigDecimal getIdModele() {
		return this.idModele;
	}

	public void setIdModele(BigDecimal idModele) {
		this.idModele = idModele;
	}

	public BigDecimal getIdTechnicien() {
		return this.idTechnicien;
	}

	public void setIdTechnicien(BigDecimal idTechnicien) {
		this.idTechnicien = idTechnicien;
	}

	public Long getIdTechnicienApresOptim() {
		return this.idTechnicienApresOptim;
	}

	public void setIdTechnicienApresOptim(Long idTechnicienApresOptim) {
		this.idTechnicienApresOptim = idTechnicienApresOptim;
	}

	public short getIn360() {
		return this.in360;
	}

	public void setIn360(short in360) {
		this.in360 = in360;
	}

	public String getInputrefidPdc() {
		return this.inputrefidPdc;
	}

	public void setInputrefidPdc(String inputrefidPdc) {
		this.inputrefidPdc = inputrefidPdc;
	}

	public String getLastTechnicienPlanifie() {
		return this.lastTechnicienPlanifie;
	}

	public void setLastTechnicienPlanifie(String lastTechnicienPlanifie) {
		this.lastTechnicienPlanifie = lastTechnicienPlanifie;
	}

	public String getListInterVoisine() {
		return this.listInterVoisine;
	}

	public void setListInterVoisine(String listInterVoisine) {
		this.listInterVoisine = listInterVoisine;
	}

	public String getMarge() {
		return this.marge;
	}

	public void setMarge(String marge) {
		this.marge = marge;
	}

	public Integer getNbDi() {
		return this.nbDi;
	}

	public void setNbDi(Integer nbDi) {
		this.nbDi = nbDi;
	}

	public Integer getNbJrtPose() {
		return this.nbJrtPose;
	}

	public void setNbJrtPose(Integer nbJrtPose) {
		this.nbJrtPose = nbJrtPose;
	}

	public String getNumint() {
		return this.numint;
	}

	public void setNumint(String numint) {
		this.numint = numint;
	}

	public String getProduit() {
		return this.produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public String getRefint() {
		return this.refint;
	}

	public void setRefint(String refint) {
		this.refint = refint;
	}

	public String getSegment() {
		return this.segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatutoptim() {
		return this.statutoptim;
	}

	public void setStatutoptim(String statutoptim) {
		this.statutoptim = statutoptim;
	}

	public Timestamp getTsCreationInter() {
		return this.tsCreationInter;
	}

	public void setTsCreationInter(Timestamp tsCreationInter) {
		this.tsCreationInter = tsCreationInter;
	}

	public String getTyperdv() {
		return this.typerdv;
	}

	public void setTyperdv(String typerdv) {
		this.typerdv = typerdv;
	}

	public TAdresse getTAdresse() {
		return this.TAdresse;
	}

	public void setTAdresse(TAdresse TAdresse) {
		this.TAdresse = TAdresse;
	}

	public Set<TCompetence> getTCompetences() {
		return this.TCompetences;
	}

	public void setTCompetences(Set<TCompetence> TCompetences) {
		this.TCompetences = TCompetences;
	}

	public TSecteur getTSecteur() {
		return this.TSecteur;
	}

	public void setTSecteur(TSecteur TSecteur) {
		this.TSecteur = TSecteur;
	}

}