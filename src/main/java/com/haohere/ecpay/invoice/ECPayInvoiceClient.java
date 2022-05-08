package com.haohere.ecpay.invoice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.haohere.ecpay.invoice.models.request.IssuingInvoiceRequest;
import com.haohere.ecpay.invoice.models.response.IssuingInvoiceResponse;

/**
 * @author haohao
 * @date 2022/4/10
 */
public interface ECPayInvoiceClient {

    /**
     * 開立發票
     * @param request
     * @return
     * @throws JsonProcessingException
     */
    IssuingInvoiceResponse createInvoice(IssuingInvoiceRequest request);
}
