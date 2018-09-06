package com.example.consul.controller.params;
import com.example.consul.controller.params.base.BaseParams;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class HuidrGetNewReportImagesParams extends BaseParams {
    @ApiModelProperty("报告id")
    private String reportId;
    @ApiModelProperty("报告类型，0.患者上传 1.检查报告 2.检验报告")
    private String type;
    @ApiModelProperty("就诊id")
    private String visitingId;

    public String getReportId() {
        return reportId;
    }

    public void setReportId (String reportId) {
        this.reportId = reportId;
    }
    public String getType() {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }
    public String getVisitingId() {
        return visitingId;
    }

    public void setVisitingId (String visitingId) {
        this.visitingId = visitingId;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append(super.toString());
        sb.append("reportId=").append(reportId==null?"null":reportId.toString());
        sb.append("type=").append(type==null?"null":type.toString());
        sb.append("visitingId=").append(visitingId==null?"null":visitingId.toString());
        sb.append("]");
        return sb.toString();
    }
}