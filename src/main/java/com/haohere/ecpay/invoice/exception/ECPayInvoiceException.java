package com.haohere.ecpay.invoice.exception;

/**
 * @author haohao
 * @date 2022/5/8
 */
public class ECPayInvoiceException extends RuntimeException {

    public ECPayInvoiceException() {
        super();
    }

    public ECPayInvoiceException(Throwable cause) {
        super(cause);
    }

    public ECPayInvoiceException(String message) {
        super(message);
    }
}
