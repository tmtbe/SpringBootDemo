//代码生成工具生成，请勿直接修改
package com.example.consul.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * ReportPeople
 */
public class ReportPeople implements Serializable {
    /**
     * patientName
     */
    private String patientName;

    /**
     * sex
     */
    private String sex;

    /**
     * age
     */
    private Integer age;

    /**
     * patientInfoId
     */
    private String patientInfoId;

    /**
     * visitingId
     */
    private String visitingId;

    /**
     * tableKey
     */
    private String tableKey;

    /**
     * admitNo
     */
    private String admitNo;

    /**
     * wardName
     */
    private String wardName;

    /**
     * bed
     */
    private String bed;

    /**
     * specimenType
     */
    private String specimenType;

    /**
     * specimenExplain
     */
    private String specimenExplain;

    /**
     * applicantDate
     */
    private String applicantDate;

    /**
     * collectDate
     */
    private String collectDate;

    /**
     * remarks
     */
    private String remarks;

    /**
     * examinerName
     */
    private String examinerName;

    /**
     * examineDate
     */
    private String examineDate;

    /**
     * reportDate
     */
    private String reportDate;

    /**
     * verifierName
     */
    private String verifierName;

    /**
     * listLabReportDetail
     */
    private List<ReportDetail> listLabReportDetail;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName (String patientName) {
        this.patientName = patientName;
    }
    public String getSex() {
        return sex;
    }

    public void setSex (String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge (Integer age) {
        this.age = age;
    }
    public String getPatientInfoId() {
        return patientInfoId;
    }

    public void setPatientInfoId (String patientInfoId) {
        this.patientInfoId = patientInfoId;
    }
    public String getVisitingId() {
        return visitingId;
    }

    public void setVisitingId (String visitingId) {
        this.visitingId = visitingId;
    }
    public String getTableKey() {
        return tableKey;
    }

    public void setTableKey (String tableKey) {
        this.tableKey = tableKey;
    }
    public String getAdmitNo() {
        return admitNo;
    }

    public void setAdmitNo (String admitNo) {
        this.admitNo = admitNo;
    }
    public String getWardName() {
        return wardName;
    }

    public void setWardName (String wardName) {
        this.wardName = wardName;
    }
    public String getBed() {
        return bed;
    }

    public void setBed (String bed) {
        this.bed = bed;
    }
    public String getSpecimenType() {
        return specimenType;
    }

    public void setSpecimenType (String specimenType) {
        this.specimenType = specimenType;
    }
    public String getSpecimenExplain() {
        return specimenExplain;
    }

    public void setSpecimenExplain (String specimenExplain) {
        this.specimenExplain = specimenExplain;
    }
    public String getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate (String applicantDate) {
        this.applicantDate = applicantDate;
    }
    public String getCollectDate() {
        return collectDate;
    }

    public void setCollectDate (String collectDate) {
        this.collectDate = collectDate;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks (String remarks) {
        this.remarks = remarks;
    }
    public String getExaminerName() {
        return examinerName;
    }

    public void setExaminerName (String examinerName) {
        this.examinerName = examinerName;
    }
    public String getExamineDate() {
        return examineDate;
    }

    public void setExamineDate (String examineDate) {
        this.examineDate = examineDate;
    }
    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate (String reportDate) {
        this.reportDate = reportDate;
    }
    public String getVerifierName() {
        return verifierName;
    }

    public void setVerifierName (String verifierName) {
        this.verifierName = verifierName;
    }
    public List<ReportDetail> getListLabReportDetail() {
        return listLabReportDetail;
    }

    public void setListLabReportDetail (List<ReportDetail> listLabReportDetail) {
        this.listLabReportDetail = listLabReportDetail;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ReportPeople other = (ReportPeople) that;
        return (this.getPatientName() == null ? other.getPatientName() == null : this.getPatientName().equals(other.getPatientName()))
        && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
        && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
        && (this.getPatientInfoId() == null ? other.getPatientInfoId() == null : this.getPatientInfoId().equals(other.getPatientInfoId()))
        && (this.getVisitingId() == null ? other.getVisitingId() == null : this.getVisitingId().equals(other.getVisitingId()))
        && (this.getTableKey() == null ? other.getTableKey() == null : this.getTableKey().equals(other.getTableKey()))
        && (this.getAdmitNo() == null ? other.getAdmitNo() == null : this.getAdmitNo().equals(other.getAdmitNo()))
        && (this.getWardName() == null ? other.getWardName() == null : this.getWardName().equals(other.getWardName()))
        && (this.getBed() == null ? other.getBed() == null : this.getBed().equals(other.getBed()))
        && (this.getSpecimenType() == null ? other.getSpecimenType() == null : this.getSpecimenType().equals(other.getSpecimenType()))
        && (this.getSpecimenExplain() == null ? other.getSpecimenExplain() == null : this.getSpecimenExplain().equals(other.getSpecimenExplain()))
        && (this.getApplicantDate() == null ? other.getApplicantDate() == null : this.getApplicantDate().equals(other.getApplicantDate()))
        && (this.getCollectDate() == null ? other.getCollectDate() == null : this.getCollectDate().equals(other.getCollectDate()))
        && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
        && (this.getExaminerName() == null ? other.getExaminerName() == null : this.getExaminerName().equals(other.getExaminerName()))
        && (this.getExamineDate() == null ? other.getExamineDate() == null : this.getExamineDate().equals(other.getExamineDate()))
        && (this.getReportDate() == null ? other.getReportDate() == null : this.getReportDate().equals(other.getReportDate()))
        && (this.getVerifierName() == null ? other.getVerifierName() == null : this.getVerifierName().equals(other.getVerifierName()))
        && (this.getListLabReportDetail() == null ? other.getListLabReportDetail() == null : this.getListLabReportDetail().equals(other.getListLabReportDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientName() == null) ? 0 : getPatientName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getPatientInfoId() == null) ? 0 : getPatientInfoId().hashCode());
        result = prime * result + ((getVisitingId() == null) ? 0 : getVisitingId().hashCode());
        result = prime * result + ((getTableKey() == null) ? 0 : getTableKey().hashCode());
        result = prime * result + ((getAdmitNo() == null) ? 0 : getAdmitNo().hashCode());
        result = prime * result + ((getWardName() == null) ? 0 : getWardName().hashCode());
        result = prime * result + ((getBed() == null) ? 0 : getBed().hashCode());
        result = prime * result + ((getSpecimenType() == null) ? 0 : getSpecimenType().hashCode());
        result = prime * result + ((getSpecimenExplain() == null) ? 0 : getSpecimenExplain().hashCode());
        result = prime * result + ((getApplicantDate() == null) ? 0 : getApplicantDate().hashCode());
        result = prime * result + ((getCollectDate() == null) ? 0 : getCollectDate().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getExaminerName() == null) ? 0 : getExaminerName().hashCode());
        result = prime * result + ((getExamineDate() == null) ? 0 : getExamineDate().hashCode());
        result = prime * result + ((getReportDate() == null) ? 0 : getReportDate().hashCode());
        result = prime * result + ((getVerifierName() == null) ? 0 : getVerifierName().hashCode());
        result = prime * result + ((getListLabReportDetail() == null) ? 0 : getListLabReportDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientName=").append(patientName==null?"null":patientName.toString());
        sb.append(", sex=").append(sex==null?"null":sex.toString());
        sb.append(", age=").append(age==null?"null":age.toString());
        sb.append(", patientInfoId=").append(patientInfoId==null?"null":patientInfoId.toString());
        sb.append(", visitingId=").append(visitingId==null?"null":visitingId.toString());
        sb.append(", tableKey=").append(tableKey==null?"null":tableKey.toString());
        sb.append(", admitNo=").append(admitNo==null?"null":admitNo.toString());
        sb.append(", wardName=").append(wardName==null?"null":wardName.toString());
        sb.append(", bed=").append(bed==null?"null":bed.toString());
        sb.append(", specimenType=").append(specimenType==null?"null":specimenType.toString());
        sb.append(", specimenExplain=").append(specimenExplain==null?"null":specimenExplain.toString());
        sb.append(", applicantDate=").append(applicantDate==null?"null":applicantDate.toString());
        sb.append(", collectDate=").append(collectDate==null?"null":collectDate.toString());
        sb.append(", remarks=").append(remarks==null?"null":remarks.toString());
        sb.append(", examinerName=").append(examinerName==null?"null":examinerName.toString());
        sb.append(", examineDate=").append(examineDate==null?"null":examineDate.toString());
        sb.append(", reportDate=").append(reportDate==null?"null":reportDate.toString());
        sb.append(", verifierName=").append(verifierName==null?"null":verifierName.toString());
        sb.append(", listLabReportDetail=").append(listLabReportDetail==null?"null":listLabReportDetail.toString());
        sb.append("]");
        return sb.toString();
    }
}