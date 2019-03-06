package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the t_inter database table.
 * 
 */
@Entity
@Table(name="t_inter")
@NamedQuery(name="TInter.findAll", query="SELECT t FROM TInter t")
public class TInter implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_inter")
	private BigDecimal idInter;

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

	@Column(name="dh_debut_arrondi_gpc")
	private Timestamp dhDebutArrondiGpc;

	@Column(name="dh_fin")
	private Timestamp dhFin;

	@Column(name="dh_fin_arrondi_gpc")
	private Timestamp dhFinArrondiGpc;

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

	private short in360;

	@Column(name="inputrefid_pdc")
	private String inputrefidPdc;

	@Column(name="last_acti_prod_profi_planif")
	private String lastActiProdProfiPlanif;

	@Column(name="last_technicien_planifie")
	private String lastTechnicienPlanifie;

	@Column(name="last_travel_planif")
	private String lastTravelPlanif;

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
		name="t_competenceinter"
		, joinColumns={
			@JoinColumn(name="id_inter")
			}
		, inverseJoinColumns={
			@JoinColumn(name="code_competence")
			}
		)
	private Set<TCompetence> TCompetences;

	//bi-directional many-to-one association to TModele
	@ManyToOne
	@JoinColumn(name="id_modele")
	private TModele TModele;

	//bi-directional many-to-one association to TSecteur
	@ManyToOne
	@JoinColumn(name="code_secteur")
	private TSecteur TSecteur;

	//bi-directional many-to-one association to TTechnicien
	@ManyToOne
	@JoinColumn(name="id_technicien")
	private TTechnicien TTechnicien1;

	//bi-directional many-to-one association to TTechnicien
	@ManyToOne
	@JoinColumn(name="id_technicien_apres_optim")
	private TTechnicien TTechnicien2;

	//bi-directional many-to-one association to TIntersla
	@OneToMany(mappedBy="TInter")
	private Set<TIntersla> TInterslas;

	public TInter() {
	}

	public BigDecimal getIdInter() {
		return this.idInter;
	}

	public void setIdInter(BigDecimal idInter) {
		this.idInter = idInter;
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

	public Timestamp getDhDebutArrondiGpc() {
		return this.dhDebutArrondiGpc;
	}

	public void setDhDebutArrondiGpc(Timestamp dhDebutArrondiGpc) {
		this.dhDebutArrondiGpc = dhDebutArrondiGpc;
	}

	public Timestamp getDhFin() {
		return this.dhFin;
	}

	public void setDhFin(Timestamp dhFin) {
		this.dhFin = dhFin;
	}

	public Timestamp getDhFinArrondiGpc() {
		return this.dhFinArrondiGpc;
	}

	public void setDhFinArrondiGpc(Timestamp dhFinArrondiGpc) {
		this.dhFinArrondiGpc = dhFinArrondiGpc;
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

	public String getLastActiProdProfiPlanif() {
		return this.lastActiProdProfiPlanif;
	}

	public void setLastActiProdProfiPlanif(String lastActiProdProfiPlanif) {
		this.lastActiProdProfiPlanif = lastActiProdProfiPlanif;
	}

	public String getLastTechnicienPlanifie() {
		return this.lastTechnicienPlanifie;
	}

	public void setLastTechnicienPlanifie(String lastTechnicienPlanifie) {
		this.lastTechnicienPlanifie = lastTechnicienPlanifie;
	}

	public String getLastTravelPlanif() {
		return this.lastTravelPlanif;
	}

	public void setLastTravelPlanif(String lastTravelPlanif) {
		this.lastTravelPlanif = lastTravelPlanif;
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

	public TModele getTModele() {
		return this.TModele;
	}

	public void setTModele(TModele TModele) {
		this.TModele = TModele;
	}

	public TSecteur getTSecteur() {
		return this.TSecteur;
	}

	public void setTSecteur(TSecteur TSecteur) {
		this.TSecteur = TSecteur;
	}

	public TTechnicien getTTechnicien1() {
		return this.TTechnicien1;
	}

	public void setTTechnicien1(TTechnicien TTechnicien1) {
		this.TTechnicien1 = TTechnicien1;
	}

	public TTechnicien getTTechnicien2() {
		return this.TTechnicien2;
	}

	public void setTTechnicien2(TTechnicien TTechnicien2) {
		this.TTechnicien2 = TTechnicien2;
	}

	public Set<TIntersla> getTInterslas() {
		return this.TInterslas;
	}

	public void setTInterslas(Set<TIntersla> TInterslas) {
		this.TInterslas = TInterslas;
	}

	public TIntersla addTIntersla(TIntersla TIntersla) {
		getTInterslas().add(TIntersla);
		TIntersla.setTInter(this);

		return TIntersla;
	}

	public TIntersla removeTIntersla(TIntersla TIntersla) {
		getTInterslas().remove(TIntersla);
		TIntersla.setTInter(null);

		return TIntersla;
	}

}