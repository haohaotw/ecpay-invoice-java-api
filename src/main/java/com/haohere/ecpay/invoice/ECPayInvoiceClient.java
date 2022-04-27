package com.haohere.ecpay.invoice;

import com.haohere.ecpay.invoice.models.response.IssuingInvoiceResponse;

/**
 * @author haohao
 * @date 2022/4/10
 */
public interface ECPayInvoiceClient {

    /**
     * 開立發票
     * @return
     */
    IssuingInvoiceResponse createInvoice();
}
