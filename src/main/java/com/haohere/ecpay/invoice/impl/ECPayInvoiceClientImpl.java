package com.haohere.ecpay.invoice.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.haohere.ecpay.invoice.ECPayInvoiceClient;
import com.haohere.ecpay.invoice.constants.ECPayInvoiceConstants;
import com.haohere.ecpay.invoice.models.base.BaseRequest;
import com.haohere.ecpay.invoice.models.base.RqHeader;
import com.haohere.ecpay.invoice.models.request.IssuingInvoiceRequest;
import com.haohere.ecpay.invoice.models.response.IssuingInvoiceResponse;
import com.haohere.ecpay.invoice.util.AES;
import okhttp3.OkHttpClient;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author haohao
 * @date 2022/4/27
 */
public class ECPayInvoiceClientImpl implements ECPayInvoiceClient {

    private final String hashKey;
    private final String hashIV;
    private final String merchantID;
    private final String baseUrl;
    private final ObjectMapper objectMapper;

    private final OkHttpClient client = new OkHttpClient();


    public ECPayInvoiceClientImpl(String hashKey, String hashIV, String merchantID, String baseUrl) {
        this.hashKey = hashKey;
        this.hashIV = hashIV;
        this.merchantID = merchantID;
        this.baseUrl = ECPayInvoiceConstants.PROD_URL;
        this.objectMapper = new ObjectMapper();
    }

    public ECPayInvoiceClientImpl() {
        this.hashKey = ECPayInvoiceConstants.TEST_HASH_KEY;
        this.hashIV = ECPayInvoiceConstants.TEST_HASH_IV;
        this.merchantID = ECPayInvoiceConstants.TEST_MERCHANT_ID;
        this.baseUrl = ECPayInvoiceConstants.TEST_URL;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public IssuingInvoiceResponse createInvoice(IssuingInvoiceRequest issuingInvoiceRequest) {
        try {
            var issuingInvoiceResponseDto = new IssuingInvoiceResponse();

            var baseRequest = new BaseRequest();

            baseRequest.merchantID = merchantID;

            var rqHeader = new RqHeader();

            rqHeader.revision = ECPayInvoiceConstants.Revision;
            rqHeader.timestamp = System.currentTimeMillis() / 1000L;

            baseRequest.rqHeader = rqHeader;

            issuingInvoiceRequest.merchantID = merchantID;

            var serializeObject = objectMapper.writeValueAsString(issuingInvoiceRequest);

            var urlEncodeResult = URLEncoder.encode(serializeObject, StandardCharsets.UTF_8);

            baseRequest.data = AES.encrypt(urlEncodeResult, hashKey, hashIV);

        } catch (Exception e) {

        }
        return null;
    }
}
