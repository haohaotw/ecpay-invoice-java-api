package com.haohere.ecpay.invoice.models.base;

/**
 * @author haohao
 * @date 2022/4/19
 */
public class BaseResponse<T> {
    /**
     * 平台商特店編號
     */
    public String platformID;

    /**
     * 特店編號
     */
    public String merchantID;

    public RqHeader rqHeader;

    /**
     * 資料內容,此為加密過 JSON 格式的資料
     */
    public T data;

    /**
     * 1 代表傳輸資料(MerchantID, RqHeader, Data)接收成功，其餘均為失敗
     */
    public int transCode;

    /**
     * 回傳訊息
     */
    public String transMsg;

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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getTransCode() {
        return transCode;
    }

    public void setTransCode(int transCode) {
        this.transCode = transCode;
    }

    public String getTransMsg() {
        return transMsg;
    }

    public void setTransMsg(String transMsg) {
        this.transMsg = transMsg;
    }
}
