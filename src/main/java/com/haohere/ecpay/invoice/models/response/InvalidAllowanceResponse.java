package com.haohere.ecpay.invoice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataResponse;

/**
 * @author haohao
 * @date 2022/6/23
 */
public class InvalidAllowanceResponse extends BaseDataResponse {

    /**
     * 發票號碼
     * 若作廢折讓成功，則會回傳發票號碼；
     * 若作廢折讓失敗，則會回傳空值。
     */
    @JsonProperty(value = "IA_Invoice_No")
    public String iaInvoiceNo;
}
