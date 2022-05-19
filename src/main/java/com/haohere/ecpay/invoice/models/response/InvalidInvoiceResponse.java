package com.haohere.ecpay.invoice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataResponse;

/**
 * @author haohao
 * @date 2022/5/19
 */
public class InvalidInvoiceResponse extends BaseDataResponse {

    /**
     * 發票號碼
     */
    @JsonProperty(value = "InvoiceNo")
    public String invoiceNo;
}
