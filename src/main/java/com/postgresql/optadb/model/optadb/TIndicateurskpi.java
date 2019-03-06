package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the t_indicateurskpi database table.
 * 
 */
@Entity
@Table(name="t_indicateurskpi")
@NamedQuery(name="TIndicateurskpi.findAll", query="SELECT t FROM TIndicateurskpi t")
public class TIndicateurskpi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_indicateurskpi")
	private BigInteger idIndicateurskpi;

	@Column(name="date_reference")
	private Timestamp dateReference;

	@Column(name="heure_reference")
	private String heureReference;

	private double ica1;

	private double ica2;

	private double ica3;

	private double ica4;

	private double ica5;

	private double ica6;

	private double ica6a;

	private double ica6b;

	private double ica6c;

	private double ica6d;

	private double ig1;

	private double ig2;

	private double ig3;

	private double ig4;

	private double rca1;

	private double rca2;

	private double rca3;

	private double rca4;

	private double rca5;

	private double rec1a;

	private double rec1b;

	private double rec2a;

	private double rec2b;

	private double rec3a;

	private double rec3b;

	private double rg1;

	private double rg2;

	private double rg3;

	private double rg4;

	public TIndicateurskpi() {
	}

	public BigInteger getIdIndicateurskpi() {
		return this.idIndicateurskpi;
	}

	public void setIdIndicateurskpi(BigInteger idIndicateurskpi) {
		this.idIndicateurskpi = idIndicateurskpi;
	}

	public Timestamp getDateReference() {
		return this.dateReference;
	}

	public void setDateReference(Timestamp dateReference) {
		this.dateReference = dateReference;
	}

	public String getHeureReference() {
		return this.heureReference;
	}

	public void setHeureReference(String heureReference) {
		this.heureReference = heureReference;
	}

	public double getIca1() {
		return this.ica1;
	}

	public void setIca1(double ica1) {
		this.ica1 = ica1;
	}

	public double getIca2() {
		return this.ica2;
	}

	public void setIca2(double ica2) {
		this.ica2 = ica2;
	}

	public double getIca3() {
		return this.ica3;
	}

	public void setIca3(double ica3) {
		this.ica3 = ica3;
	}

	public double getIca4() {
		return this.ica4;
	}

	public void setIca4(double ica4) {
		this.ica4 = ica4;
	}

	public double getIca5() {
		return this.ica5;
	}

	public void setIca5(double ica5) {
		this.ica5 = ica5;
	}

	public double getIca6() {
		return this.ica6;
	}

	public void setIca6(double ica6) {
		this.ica6 = ica6;
	}

	public double getIca6a() {
		return this.ica6a;
	}

	public void setIca6a(double ica6a) {
		this.ica6a = ica6a;
	}

	public double getIca6b() {
		return this.ica6b;
	}

	public void setIca6b(double ica6b) {
		this.ica6b = ica6b;
	}

	public double getIca6c() {
		return this.ica6c;
	}

	public void setIca6c(double ica6c) {
		this.ica6c = ica6c;
	}

	public double getIca6d() {
		return this.ica6d;
	}

	public void setIca6d(double ica6d) {
		this.ica6d = ica6d;
	}

	public double getIg1() {
		return this.ig1;
	}

	public void setIg1(double ig1) {
		this.ig1 = ig1;
	}

	public double getIg2() {
		return this.ig2;
	}

	public void setIg2(double ig2) {
		this.ig2 = ig2;
	}

	public double getIg3() {
		return this.ig3;
	}

	public void setIg3(double ig3) {
		this.ig3 = ig3;
	}

	public double getIg4() {
		return this.ig4;
	}

	public void setIg4(double ig4) {
		this.ig4 = ig4;
	}

	public double getRca1() {
		return this.rca1;
	}

	public void setRca1(double rca1) {
		this.rca1 = rca1;
	}

	public double getRca2() {
		return this.rca2;
	}

	public void setRca2(double rca2) {
		this.rca2 = rca2;
	}

	public double getRca3() {
		return this.rca3;
	}

	public void setRca3(double rca3) {
		this.rca3 = rca3;
	}

	public double getRca4() {
		return this.rca4;
	}

	public void setRca4(double rca4) {
		this.rca4 = rca4;
	}

	public double getRca5() {
		return this.rca5;
	}

	public void setRca5(double rca5) {
		this.rca5 = rca5;
	}

	public double getRec1a() {
		return this.rec1a;
	}

	public void setRec1a(double rec1a) {
		this.rec1a = rec1a;
	}

	public double getRec1b() {
		return this.rec1b;
	}

	public void setRec1b(double rec1b) {
		this.rec1b = rec1b;
	}

	public double getRec2a() {
		return this.rec2a;
	}

	public void setRec2a(double rec2a) {
		this.rec2a = rec2a;
	}

	public double getRec2b() {
		return this.rec2b;
	}

	public void setRec2b(double rec2b) {
		this.rec2b = rec2b;
	}

	public double getRec3a() {
		return this.rec3a;
	}

	public void setRec3a(double rec3a) {
		this.rec3a = rec3a;
	}

	public double getRec3b() {
		return this.rec3b;
	}

	public void setRec3b(double rec3b) {
		this.rec3b = rec3b;
	}

	public double getRg1() {
		return this.rg1;
	}

	public void setRg1(double rg1) {
		this.rg1 = rg1;
	}

	public double getRg2() {
		return this.rg2;
	}

	public void setRg2(double rg2) {
		this.rg2 = rg2;
	}

	public double getRg3() {
		return this.rg3;
	}

	public void setRg3(double rg3) {
		this.rg3 = rg3;
	}

	public double getRg4() {
		return this.rg4;
	}

	public void setRg4(double rg4) {
		this.rg4 = rg4;
	}

}