package com.haohere.ecpay.invoice;

import com.haohere.ecpay.invoice.models.request.*;
import com.haohere.ecpay.invoice.models.response.*;

/**
 * @author haohao
 * @date 2022/4/10
 */
public interface ECPayInvoiceClient {

    /**
     * 一般開立發票
     *
     * @param model
     * @return
     */
    IssuingInvoiceResponse createInvoice(IssuingInvoiceRequest model);

    /**
     * 查詢發票
     *
     * @param model
     * @return
     */
    QueryInvoiceInfoResponse queryInvoice(QueryInvoiceInfoRequest model);

    /**
     * 作廢發票
     *
     * @param model
     * @return
     */
    InvalidInvoiceResponse invalidInvoice(InvalidInvoiceRequest model);

    /**
     * 開立折讓 (紙本同意)
     *
     * @param model
     * @return
     */
    IssuingAllowanceResponse createAllowance(IssuingAllowanceRequest model);


    /**
     * 開立折讓 (線上同意)
     *
     * @param model
     * @return
     */
    IssuingAllowanceByCollegiateResponse createAllowanceByCollegiate(IssuingAllowanceByCollegiateRequest model);

    /**
     * 作廢折讓 (紙本同意)
     * @param model
     * @return
     */
    InvalidAllowanceResponse invalidAllowance(InvalidAllowanceRequest model);


    /**
     * 作廢折讓 (線上同意)
     * @param model
     * @return
     */
    InvalidAllowanceByCollegiateResponse invalidAllowanceByCollegiate(InvalidAllowanceByCollegiateRequest model);
}
