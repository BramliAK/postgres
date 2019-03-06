package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


/**
 * The persistent class for the t_sla database table.
 * 
 */
@Entity
@Table(name="t_sla")
@NamedQuery(name="TSla.findAll", query="SELECT t FROM TSla t")
public class TSla implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="code_sla")
	private String codeSla;

	@Column(name="type_sla")
	private String typeSla;

	//bi-directional many-to-one association to TIntersla
	@OneToMany(mappedBy="TSla")
	private Set<TIntersla> TInterslas;

	//bi-directional many-to-one association to TFamillesla
	@ManyToOne
	@JoinColumn(name="code_famillesla",insertable = false, updatable = false)
	private TFamillesla TFamillesla;

	//bi-directional many-to-one association to TModele
	@ManyToOne
	@JoinColumn(name="id_modele",insertable = false, updatable = false)
	private TModele TModele;

	//bi-directional many-to-one association to TValeursla
	@OneToMany(mappedBy="TSla")
	private Set<TValeursla> TValeurslas;

	public TSla() {
	}

	public String getCodeSla() {
		return this.codeSla;
	}

	public void setCodeSla(String codeSla) {
		this.codeSla = codeSla;
	}

	public String getTypeSla() {
		return this.typeSla;
	}

	public void setTypeSla(String typeSla) {
		this.typeSla = typeSla;
	}

	public Set<TIntersla> getTInterslas() {
		return this.TInterslas;
	}

	public void setTInterslas(Set<TIntersla> TInterslas) {
		this.TInterslas = TInterslas;
	}

	public TIntersla addTIntersla(TIntersla TIntersla) {
		getTInterslas().add(TIntersla);
		TIntersla.setTSla(this);

		return TIntersla;
	}

	public TIntersla removeTIntersla(TIntersla TIntersla) {
		getTInterslas().remove(TIntersla);
		TIntersla.setTSla(null);

		return TIntersla;
	}

	public TFamillesla getTFamillesla() {
		return this.TFamillesla;
	}

	public void setTFamillesla(TFamillesla TFamillesla) {
		this.TFamillesla = TFamillesla;
	}

	public TModele getTModele() {
		return this.TModele;
	}

	public void setTModele(TModele TModele) {
		this.TModele = TModele;
	}

	public Set<TValeursla> getTValeurslas() {
		return this.TValeurslas;
	}

	public void setTValeurslas(Set<TValeursla> TValeurslas) {
		this.TValeurslas = TValeurslas;
	}

	public TValeursla addTValeursla(TValeursla TValeursla) {
		getTValeurslas().add(TValeursla);
		TValeursla.setTSla(this);

		return TValeursla;
	}

	public TValeursla removeTValeursla(TValeursla TValeursla) {
		getTValeurslas().remove(TValeursla);
		TValeursla.setTSla(null);

		return TValeursla;
	}

}