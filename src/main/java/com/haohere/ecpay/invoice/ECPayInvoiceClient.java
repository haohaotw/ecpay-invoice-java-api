package com.haohere.ecpay.invoice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.haohere.ecpay.invoice.models.request.InvalidInvoiceRequest;
import com.haohere.ecpay.invoice.models.request.IssuingInvoiceRequest;
import com.haohere.ecpay.invoice.models.request.QueryInvoiceInfoRequest;
import com.haohere.ecpay.invoice.models.response.InvalidInvoiceResponse;
import com.haohere.ecpay.invoice.models.response.IssuingInvoiceResponse;
import com.haohere.ecpay.invoice.models.response.QueryInvoiceInfoResponse;

/**
 * @author haohao
 * @date 2022/4/10
 */
public interface ECPayInvoiceClient {

    /**
     * 開立發票
     * @param model
     * @return
     */
    IssuingInvoiceResponse createInvoice(IssuingInvoiceRequest model);

    /**
     * 查詢發票
     * @param model
     * @return
     */
    QueryInvoiceInfoResponse queryInvoice(QueryInvoiceInfoRequest model);

    /**
     * 作廢發票
     * @param model
     * @return
     */
    InvalidInvoiceResponse invalidInvoice(InvalidInvoiceRequest model);

}
