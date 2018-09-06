package com.example.consul.controller.params.base;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class BaseParams{
    @ApiModelProperty("huidrKey")
    private String huidrKey;
    @ApiModelProperty("seq")
    private String seq;
    @ApiModelProperty("sid")
    private String sid;

    public String getHuidrKey() {
        return huidrKey;
    }

    public void setHuidrKey (String huidrKey) {
        this.huidrKey = huidrKey;
    }
    public String getSeq() {
        return seq;
    }

    public void setSeq (String seq) {
        this.seq = seq;
    }
    public String getSid() {
        return sid;
    }

    public void setSid (String sid) {
        this.sid = sid;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("huidrKey=").append(huidrKey==null?"null":huidrKey.toString());
        sb.append("seq=").append(seq==null?"null":seq.toString());
        sb.append("sid=").append(sid==null?"null":sid.toString());
        sb.append("]");
        return sb.toString();
    }
}