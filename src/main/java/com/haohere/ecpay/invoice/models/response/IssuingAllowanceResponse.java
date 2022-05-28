package com.haohere.ecpay.invoice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataResponse;

/**
 * 開立折讓回覆 (紙本同意)
 *
 * @author haohao
 * @date 2022/5/28
 */
public class IssuingAllowanceResponse extends BaseDataResponse {

    @JsonProperty(value = "IA_Allow_No")
    public String iaAllowNo;

    @JsonProperty(value = "IA_Invoice_No")
    public String iaInvoiceNo;

    @JsonProperty(value = "IA_Date")
    public String iaDate;

    @JsonProperty(value = "IA_Remain_Allowance_Amt")
    public String iaRemainAllowanceAmt;
}
