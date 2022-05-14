package com.haohere.ecpay.invoice.models.base;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author haohao
 * @date 2022/5/14
 */
public class BaseDataRequest {

    /**
     * 特店編號
     */
    @JsonProperty(value = "MerchantID")
    public String merchantID;

    /**
     * 特店自訂編號 (需為唯一值不可重複使用，請勿使用特殊符號)
     */
    @JsonProperty(value = "RelateNumber")
    public String relateNumber;
}
