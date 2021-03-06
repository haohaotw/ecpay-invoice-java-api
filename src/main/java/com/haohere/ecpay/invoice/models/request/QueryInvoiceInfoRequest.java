package com.haohere.ecpay.invoice.models.request;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataRequest;


/**
 *  查詢發票明細
 *  查詢條件則一即可
 *  1. 透過 特店自訂編號
 *  2. 透過 發票號碼以及發票日期
 * @author haohao
 * @date 2022/5/14
 */
public class QueryInvoiceInfoRequest  extends BaseDataRequest {

    /**
     * 發票號碼
     */
    @JsonProperty(value = "InvoiceNo")
    public String invoiceNo;

    /**
     *  發票日期 (yyyy-MM-dd)
     */
    @JsonProperty(value = "InvoiceDate")
    public String invoiceDate ;
}
