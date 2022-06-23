package com.haohere.ecpay.invoice.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataRequest;

/**
 * @author haohao
 * @date 2022/6/23
 */
public class InvalidAllowanceRequest extends BaseDataRequest {

    /**
     * 發票號碼
     */
    @JsonProperty(value = "InvoiceNo")
    public String invoiceNo;

    /**
     * 折讓編號
     */
    @JsonProperty(value = "AllowanceNo")
    public String allowanceNo;

    /**
     * 作廢折讓原因
     */
    @JsonProperty(value = "Reason")
    public String reason;
}
