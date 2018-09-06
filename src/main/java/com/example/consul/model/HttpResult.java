//代码生成工具生成，请勿直接修改
package com.example.consul.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * HttpResult
 */
public class HttpResult<T> implements Serializable {
    /**
     * clientType
     */
    private Integer clientType;

    /**
     * huidrKey
     */
    private String huidrKey;

    /**
     * seq
     */
    private Integer seq;

    /**
     * status
     */
    private Integer status;

    /**
     * desc
     */
    private String desc;

    /**
     * sid
     */
    private String sid;

    /**
     * token
     */
    private String token;

    /**
     * currPage
     */
    private Integer currPage;

    /**
     * pageSize
     */
    private Integer pageSize;

    /**
     * serverTime
     */
    private String serverTime;

    /**
     * retValue
     */
    private T retValue;

    public Integer getClientType() {
        return clientType;
    }

    public void setClientType (Integer clientType) {
        this.clientType = clientType;
    }
    public String getHuidrKey() {
        return huidrKey;
    }

    public void setHuidrKey (String huidrKey) {
        this.huidrKey = huidrKey;
    }
    public Integer getSeq() {
        return seq;
    }

    public void setSeq (Integer seq) {
        this.seq = seq;
    }
    public Integer getStatus() {
        return status;
    }

    public void setStatus (Integer status) {
        this.status = status;
    }
    public String getDesc() {
        return desc;
    }

    public void setDesc (String desc) {
        this.desc = desc;
    }
    public String getSid() {
        return sid;
    }

    public void setSid (String sid) {
        this.sid = sid;
    }
    public String getToken() {
        return token;
    }

    public void setToken (String token) {
        this.token = token;
    }
    public Integer getCurrPage() {
        return currPage;
    }

    public void setCurrPage (Integer currPage) {
        this.currPage = currPage;
    }
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize (Integer pageSize) {
        this.pageSize = pageSize;
    }
    public String getServerTime() {
        return serverTime;
    }

    public void setServerTime (String serverTime) {
        this.serverTime = serverTime;
    }
    public T getRetValue() {
        return retValue;
    }

    public void setRetValue (T retValue) {
        this.retValue = retValue;
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
        HttpResult<T> other = (HttpResult<T>) that;
        return (this.getClientType() == null ? other.getClientType() == null : this.getClientType().equals(other.getClientType()))
        && (this.getHuidrKey() == null ? other.getHuidrKey() == null : this.getHuidrKey().equals(other.getHuidrKey()))
        && (this.getSeq() == null ? other.getSeq() == null : this.getSeq().equals(other.getSeq()))
        && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
        && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()))
        && (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
        && (this.getToken() == null ? other.getToken() == null : this.getToken().equals(other.getToken()))
        && (this.getCurrPage() == null ? other.getCurrPage() == null : this.getCurrPage().equals(other.getCurrPage()))
        && (this.getPageSize() == null ? other.getPageSize() == null : this.getPageSize().equals(other.getPageSize()))
        && (this.getServerTime() == null ? other.getServerTime() == null : this.getServerTime().equals(other.getServerTime()))
        && (this.getRetValue() == null ? other.getRetValue() == null : this.getRetValue().equals(other.getRetValue()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClientType() == null) ? 0 : getClientType().hashCode());
        result = prime * result + ((getHuidrKey() == null) ? 0 : getHuidrKey().hashCode());
        result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getToken() == null) ? 0 : getToken().hashCode());
        result = prime * result + ((getCurrPage() == null) ? 0 : getCurrPage().hashCode());
        result = prime * result + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        result = prime * result + ((getServerTime() == null) ? 0 : getServerTime().hashCode());
        result = prime * result + ((getRetValue() == null) ? 0 : getRetValue().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientType=").append(clientType==null?"null":clientType.toString());
        sb.append(", huidrKey=").append(huidrKey==null?"null":huidrKey.toString());
        sb.append(", seq=").append(seq==null?"null":seq.toString());
        sb.append(", status=").append(status==null?"null":status.toString());
        sb.append(", desc=").append(desc==null?"null":desc.toString());
        sb.append(", sid=").append(sid==null?"null":sid.toString());
        sb.append(", token=").append(token==null?"null":token.toString());
        sb.append(", currPage=").append(currPage==null?"null":currPage.toString());
        sb.append(", pageSize=").append(pageSize==null?"null":pageSize.toString());
        sb.append(", serverTime=").append(serverTime==null?"null":serverTime.toString());
        sb.append(", retValue=").append(retValue==null?"null":retValue.toString());
        sb.append("]");
        return sb.toString();
    }
}