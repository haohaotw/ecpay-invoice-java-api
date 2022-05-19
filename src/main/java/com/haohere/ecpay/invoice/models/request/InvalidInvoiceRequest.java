package com.haohere.ecpay.invoice.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataRequest;

/**
 * @author haohao
 * @date 2022/5/19
 */
public class InvalidInvoiceRequest extends BaseDataRequest {

    /**
     * 發票號碼
     */
    @JsonProperty(value = "InvoiceNo")
    public String invoiceNo;

    /**
     * 發票日期 (yyyy-MM-dd)
     */
    @JsonProperty(value = "InvoiceDate")
    public String invoiceDate;

    /**
     * 作廢原因
     */
    @JsonProperty(value = "Reason")
    public String reason;
}
