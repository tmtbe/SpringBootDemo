//代码生成工具生成，请勿直接修改
package com.android.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * ReportDetail
 */
public class ReportDetail implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * labId
     */
    private String labId;

    /**
     * index
     */
    private Integer index;

    /**
     * labIndexNo
     */
    private Integer labIndexNo;

    /**
     * labIndexCode
     */
    private Integer labIndexCode;

    /**
     * labIndexName
     */
    private String labIndexName;

    /**
     * labIndesResult
     */
    private String labIndesResult;

    /**
     * referenceRange
     */
    private String referenceRange;

    /**
     * unit
     */
    private String unit;

    /**
     * unusualPrompt
     */
    private String unusualPrompt;

    /**
     * unusualPromptStr
     */
    private String unusualPromptStr;

    /**
     * tableKey
     */
    private String tableKey;

    public Integer getId() {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }
    public String getLabId() {
        return labId;
    }

    public void setLabId (String labId) {
        this.labId = labId;
    }
    public Integer getIndex() {
        return index;
    }

    public void setIndex (Integer index) {
        this.index = index;
    }
    public Integer getLabIndexNo() {
        return labIndexNo;
    }

    public void setLabIndexNo (Integer labIndexNo) {
        this.labIndexNo = labIndexNo;
    }
    public Integer getLabIndexCode() {
        return labIndexCode;
    }

    public void setLabIndexCode (Integer labIndexCode) {
        this.labIndexCode = labIndexCode;
    }
    public String getLabIndexName() {
        return labIndexName;
    }

    public void setLabIndexName (String labIndexName) {
        this.labIndexName = labIndexName;
    }
    public String getLabIndesResult() {
        return labIndesResult;
    }

    public void setLabIndesResult (String labIndesResult) {
        this.labIndesResult = labIndesResult;
    }
    public String getReferenceRange() {
        return referenceRange;
    }

    public void setReferenceRange (String referenceRange) {
        this.referenceRange = referenceRange;
    }
    public String getUnit() {
        return unit;
    }

    public void setUnit (String unit) {
        this.unit = unit;
    }
    public String getUnusualPrompt() {
        return unusualPrompt;
    }

    public void setUnusualPrompt (String unusualPrompt) {
        this.unusualPrompt = unusualPrompt;
    }
    public String getUnusualPromptStr() {
        return unusualPromptStr;
    }

    public void setUnusualPromptStr (String unusualPromptStr) {
        this.unusualPromptStr = unusualPromptStr;
    }
    public String getTableKey() {
        return tableKey;
    }

    public void setTableKey (String tableKey) {
        this.tableKey = tableKey;
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
        ReportDetail other = (ReportDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        && (this.getLabId() == null ? other.getLabId() == null : this.getLabId().equals(other.getLabId()))
        && (this.getIndex() == null ? other.getIndex() == null : this.getIndex().equals(other.getIndex()))
        && (this.getLabIndexNo() == null ? other.getLabIndexNo() == null : this.getLabIndexNo().equals(other.getLabIndexNo()))
        && (this.getLabIndexCode() == null ? other.getLabIndexCode() == null : this.getLabIndexCode().equals(other.getLabIndexCode()))
        && (this.getLabIndexName() == null ? other.getLabIndexName() == null : this.getLabIndexName().equals(other.getLabIndexName()))
        && (this.getLabIndesResult() == null ? other.getLabIndesResult() == null : this.getLabIndesResult().equals(other.getLabIndesResult()))
        && (this.getReferenceRange() == null ? other.getReferenceRange() == null : this.getReferenceRange().equals(other.getReferenceRange()))
        && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
        && (this.getUnusualPrompt() == null ? other.getUnusualPrompt() == null : this.getUnusualPrompt().equals(other.getUnusualPrompt()))
        && (this.getUnusualPromptStr() == null ? other.getUnusualPromptStr() == null : this.getUnusualPromptStr().equals(other.getUnusualPromptStr()))
        && (this.getTableKey() == null ? other.getTableKey() == null : this.getTableKey().equals(other.getTableKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLabId() == null) ? 0 : getLabId().hashCode());
        result = prime * result + ((getIndex() == null) ? 0 : getIndex().hashCode());
        result = prime * result + ((getLabIndexNo() == null) ? 0 : getLabIndexNo().hashCode());
        result = prime * result + ((getLabIndexCode() == null) ? 0 : getLabIndexCode().hashCode());
        result = prime * result + ((getLabIndexName() == null) ? 0 : getLabIndexName().hashCode());
        result = prime * result + ((getLabIndesResult() == null) ? 0 : getLabIndesResult().hashCode());
        result = prime * result + ((getReferenceRange() == null) ? 0 : getReferenceRange().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getUnusualPrompt() == null) ? 0 : getUnusualPrompt().hashCode());
        result = prime * result + ((getUnusualPromptStr() == null) ? 0 : getUnusualPromptStr().hashCode());
        result = prime * result + ((getTableKey() == null) ? 0 : getTableKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id==null?"null":id.toString());
        sb.append(", labId=").append(labId==null?"null":labId.toString());
        sb.append(", index=").append(index==null?"null":index.toString());
        sb.append(", labIndexNo=").append(labIndexNo==null?"null":labIndexNo.toString());
        sb.append(", labIndexCode=").append(labIndexCode==null?"null":labIndexCode.toString());
        sb.append(", labIndexName=").append(labIndexName==null?"null":labIndexName.toString());
        sb.append(", labIndesResult=").append(labIndesResult==null?"null":labIndesResult.toString());
        sb.append(", referenceRange=").append(referenceRange==null?"null":referenceRange.toString());
        sb.append(", unit=").append(unit==null?"null":unit.toString());
        sb.append(", unusualPrompt=").append(unusualPrompt==null?"null":unusualPrompt.toString());
        sb.append(", unusualPromptStr=").append(unusualPromptStr==null?"null":unusualPromptStr.toString());
        sb.append(", tableKey=").append(tableKey==null?"null":tableKey.toString());
        sb.append("]");
        return sb.toString();
    }
}