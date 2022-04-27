package com.haohere.ecpay.invoice.impl;

import com.haohere.ecpay.invoice.ECPayInvoiceClient;
import com.haohere.ecpay.invoice.constants.ECPayInvoiceConstants;
import com.haohere.ecpay.invoice.models.response.IssuingInvoiceResponse;

/**
 * @author haohao
 * @date 2022/4/27
 */
public class ECPayInvoiceClientImpl implements ECPayInvoiceClient {

    private final String hashKey;
    private final String hashIV;
    private final String merchantID;
    private final String baseUrl;


    public ECPayInvoiceClientImpl(String hashKey, String hashIV, String merchantID, String baseUrl) {
        this.hashKey = hashKey;
        this.hashIV = hashIV;
        this.merchantID = merchantID;
        this.baseUrl = ECPayInvoiceConstants.PROD_URL;
    }

    public ECPayInvoiceClientImpl() {
        this.hashKey = ECPayInvoiceConstants.TEST_HASH_KEY;
        this.hashIV = ECPayInvoiceConstants.TEST_HASH_IV;
        this.merchantID = ECPayInvoiceConstants.TEST_MERCHANT_ID;
        this.baseUrl = ECPayInvoiceConstants.TEST_URL;
    }

    @Override
    public IssuingInvoiceResponse createInvoice() {
        return null;
    }
}
