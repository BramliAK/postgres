package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the t_errorflux database table.
 * 
 */
@Entity
@Table(name="t_errorflux")
@NamedQuery(name="TErrorflux.findAll", query="SELECT t FROM TErrorflux t")
public class TErrorflux implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_errorflux")
	private BigDecimal idErrorflux;

	private String codeerror;

	private String etapetreatment;

	private String externalfluxfile;

	private String externalfluxid;

	private String externalfluxtype;

	private String messageerror;

	private String stacktracefile;

	@Column(name="ts_error")
	private Timestamp tsError;

	@Column(name="type_error")
	private String typeError;

	private String ws360fluxfile;

	public TErrorflux() {
	}

	public BigDecimal getIdErrorflux() {
		return this.idErrorflux;
	}

	public void setIdErrorflux(BigDecimal idErrorflux) {
		this.idErrorflux = idErrorflux;
	}

	public String getCodeerror() {
		return this.codeerror;
	}

	public void setCodeerror(String codeerror) {
		this.codeerror = codeerror;
	}

	public String getEtapetreatment() {
		return this.etapetreatment;
	}

	public void setEtapetreatment(String etapetreatment) {
		this.etapetreatment = etapetreatment;
	}

	public String getExternalfluxfile() {
		return this.externalfluxfile;
	}

	public void setExternalfluxfile(String externalfluxfile) {
		this.externalfluxfile = externalfluxfile;
	}

	public String getExternalfluxid() {
		return this.externalfluxid;
	}

	public void setExternalfluxid(String externalfluxid) {
		this.externalfluxid = externalfluxid;
	}

	public String getExternalfluxtype() {
		return this.externalfluxtype;
	}

	public void setExternalfluxtype(String externalfluxtype) {
		this.externalfluxtype = externalfluxtype;
	}

	public String getMessageerror() {
		return this.messageerror;
	}

	public void setMessageerror(String messageerror) {
		this.messageerror = messageerror;
	}

	public String getStacktracefile() {
		return this.stacktracefile;
	}

	public void setStacktracefile(String stacktracefile) {
		this.stacktracefile = stacktracefile;
	}

	public Timestamp getTsError() {
		return this.tsError;
	}

	public void setTsError(Timestamp tsError) {
		this.tsError = tsError;
	}

	public String getTypeError() {
		return this.typeError;
	}

	public void setTypeError(String typeError) {
		this.typeError = typeError;
	}

	public String getWs360fluxfile() {
		return this.ws360fluxfile;
	}

	public void setWs360fluxfile(String ws360fluxfile) {
		this.ws360fluxfile = ws360fluxfile;
	}

}