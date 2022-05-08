package com.haohere.ecpay.invoice.models.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author haohao
 * @date 2022/4/19
 */
public class BaseRequest {

    /**
     * 平台商特店編號
     */
    @JsonProperty(value = "PlatformID")
    public String platformID;

    /**
     * 特店編號
     */
    @JsonProperty(value = "MerchantID")
    public String merchantID;


    @JsonProperty(value = "RqHeader")
    public RqHeader rqHeader;


    /**
     *  加密資料
     */
    @JsonProperty(value = "Data")
    public String data;

    public String getPlatformID() {
        return platformID;
    }

    public void setPlatformID(String platformID) {
        this.platformID = platformID;
    }

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public RqHeader getRqHeader() {
        return rqHeader;
    }

    public void setRqHeader(RqHeader rqHeader) {
        this.rqHeader = rqHeader;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
