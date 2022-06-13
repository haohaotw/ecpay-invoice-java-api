package com.haohere.ecpay.invoice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataResponse;

/**
 * @author haohao
 * @date 2022/6/11
 */
public class IssuingAllowanceByCollegiateResponse extends BaseDataResponse {

    @JsonProperty(value = "IA_Allow_No")
    public String iaAllowNo;

    @JsonProperty(value = "IA_Invoice_No")
    public String iaInvoiceNo;

    @JsonProperty(value = "IA_TempDate")
    public String iaTempDate;

    @JsonProperty(value = "IA_Date")
    public String iaDate;

    @JsonProperty(value = "IA_TempExpireDate")
    public String iaTempExpireDate;

    @JsonProperty(value = "IA_Remain_Allowance_Amt")
    public String iaRemainAllowanceAmt;
}
