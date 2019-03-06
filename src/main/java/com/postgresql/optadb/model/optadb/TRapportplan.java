package com.postgresql.optadb.model.optadb;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the t_rapportplan database table.
 * 
 */
@Entity
@Table(name="t_rapportplan")
@NamedQuery(name="TRapportplan.findAll", query="SELECT t FROM TRapportplan t")
public class TRapportplan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_rapportplan")
	private BigInteger idRapportplan;

	private Long allocationtype;

	private BigDecimal averagetraveldistance;

	private String averagetraveltime;

	private String diagnostics;

	private BigDecimal id360;

	private Timestamp inputreferencedatetime;

	private String inputreferenceid;

	private BigDecimal lastplanid;

	private Timestamp outputdatetime;

	private String plantype;

	private BigDecimal quality;

	private Timestamp schedulefrom;

	private Timestamp scheduleto;

	private Timestamp timetaken;

	private Long totalallocatedoutofsla1;

	private Long totalallocations;

	private BigDecimal totaltraveldistance;

	private String totaltraveltime;

	private Long totalunallocated;

	private String traveltype;

	private BigDecimal utilisation;

	public TRapportplan() {
	}

	public BigInteger getIdRapportplan() {
		return this.idRapportplan;
	}

	public void setIdRapportplan(BigInteger idRapportplan) {
		this.idRapportplan = idRapportplan;
	}

	public Long getAllocationtype() {
		return this.allocationtype;
	}

	public void setAllocationtype(Long allocationtype) {
		this.allocationtype = allocationtype;
	}

	public BigDecimal getAveragetraveldistance() {
		return this.averagetraveldistance;
	}

	public void setAveragetraveldistance(BigDecimal averagetraveldistance) {
		this.averagetraveldistance = averagetraveldistance;
	}

	public String getAveragetraveltime() {
		return this.averagetraveltime;
	}

	public void setAveragetraveltime(String averagetraveltime) {
		this.averagetraveltime = averagetraveltime;
	}

	public String getDiagnostics() {
		return this.diagnostics;
	}

	public void setDiagnostics(String diagnostics) {
		this.diagnostics = diagnostics;
	}

	public BigDecimal getId360() {
		return this.id360;
	}

	public void setId360(BigDecimal id360) {
		this.id360 = id360;
	}

	public Timestamp getInputreferencedatetime() {
		return this.inputreferencedatetime;
	}

	public void setInputreferencedatetime(Timestamp inputreferencedatetime) {
		this.inputreferencedatetime = inputreferencedatetime;
	}

	public String getInputreferenceid() {
		return this.inputreferenceid;
	}

	public void setInputreferenceid(String inputreferenceid) {
		this.inputreferenceid = inputreferenceid;
	}

	public BigDecimal getLastplanid() {
		return this.lastplanid;
	}

	public void setLastplanid(BigDecimal lastplanid) {
		this.lastplanid = lastplanid;
	}

	public Timestamp getOutputdatetime() {
		return this.outputdatetime;
	}

	public void setOutputdatetime(Timestamp outputdatetime) {
		this.outputdatetime = outputdatetime;
	}

	public String getPlantype() {
		return this.plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

	public BigDecimal getQuality() {
		return this.quality;
	}

	public void setQuality(BigDecimal quality) {
		this.quality = quality;
	}

	public Timestamp getSchedulefrom() {
		return this.schedulefrom;
	}

	public void setSchedulefrom(Timestamp schedulefrom) {
		this.schedulefrom = schedulefrom;
	}

	public Timestamp getScheduleto() {
		return this.scheduleto;
	}

	public void setScheduleto(Timestamp scheduleto) {
		this.scheduleto = scheduleto;
	}

	public Timestamp getTimetaken() {
		return this.timetaken;
	}

	public void setTimetaken(Timestamp timetaken) {
		this.timetaken = timetaken;
	}

	public Long getTotalallocatedoutofsla1() {
		return this.totalallocatedoutofsla1;
	}

	public void setTotalallocatedoutofsla1(Long totalallocatedoutofsla1) {
		this.totalallocatedoutofsla1 = totalallocatedoutofsla1;
	}

	public Long getTotalallocations() {
		return this.totalallocations;
	}

	public void setTotalallocations(Long totalallocations) {
		this.totalallocations = totalallocations;
	}

	public BigDecimal getTotaltraveldistance() {
		return this.totaltraveldistance;
	}

	public void setTotaltraveldistance(BigDecimal totaltraveldistance) {
		this.totaltraveldistance = totaltraveldistance;
	}

	public String getTotaltraveltime() {
		return this.totaltraveltime;
	}

	public void setTotaltraveltime(String totaltraveltime) {
		this.totaltraveltime = totaltraveltime;
	}

	public Long getTotalunallocated() {
		return this.totalunallocated;
	}

	public void setTotalunallocated(Long totalunallocated) {
		this.totalunallocated = totalunallocated;
	}

	public String getTraveltype() {
		return this.traveltype;
	}

	public void setTraveltype(String traveltype) {
		this.traveltype = traveltype;
	}

	public BigDecimal getUtilisation() {
		return this.utilisation;
	}

	public void setUtilisation(BigDecimal utilisation) {
		this.utilisation = utilisation;
	}

}