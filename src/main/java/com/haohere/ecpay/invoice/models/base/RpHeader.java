package com.haohere.ecpay.invoice.models.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author haohao
 * @date 2022/4/28
 */
public class RpHeader {
    /**
     * 時間戳，格式為 Unix timestamp
     * 注意事項：
     * 若時間戳跟綠界接收到時間超過 10 分鐘時，交易會失敗無法進行
     */
    @JsonProperty(value = "Timestamp")
    public long timestamp;

    /**
     * 串接規格文件版號
     */
    @JsonProperty(value = "Revision")
    public String revision;

    @JsonProperty(value = "RqID")
    public String rqID;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getRqID() {
        return rqID;
    }

    public void setRqID(String rqID) {
        this.rqID = rqID;
    }
}
