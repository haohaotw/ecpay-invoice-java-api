package com.haohere.ecpay.invoice.models.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author haohao
 * @date 2022/4/19
 */
public class BaseDataResponse {

    /**
     * 特店自訂編號 (需為唯一值不可重複使用，請勿使用特殊符號)
     */
    @JsonProperty(value = "RelateNumber")
    public String relateNumber;

    /**
     * 回應代碼
     */
    @JsonProperty(value = "RtnCode")
    public int rtnCode;

    /**
     * 回應訊息
     */
    @JsonProperty(value = "RtnMsg")
    public String rtnMsg;

    public String getRelateNumber() {
        return relateNumber;
    }

    public void setRelateNumber(String relateNumber) {
        this.relateNumber = relateNumber;
    }

    public int getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(int rtnCode) {
        this.rtnCode = rtnCode;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }
}
