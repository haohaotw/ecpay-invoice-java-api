package com.haohere.ecpay.invoice.examples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.haohere.ecpay.invoice.impl.ECPayInvoiceClientImpl;
import com.haohere.ecpay.invoice.models.request.*;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @author haohao
 * @date 2022/5/19
 */
public class ECPayInvoiceExample {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void createInvoiceTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new IssuingInvoiceRequest();

        request.customerEmail = "test@ecpay.com.tw";
        request.setRelateNumber(String.valueOf(Math.random()));
        request.setCustomerName("Mark");
        request.setCustomerAddr("Taiwan");
        request.setCustomerIdentifier("");
        request.setCustomerPhone("0912345678");
        request.setCarrierType("");
        request.setCarrierNum("");
        request.setInvType("07");
        request.setInvoiceRemark("測試@@%$#@$$$@^^$&");
        request.setPrint("0");
        request.setDonation("1");
        request.setTaxType("1");
        request.setLoveCode("1234");
        request.setSalesAmount(1000);
        request.setVat("1");

        var itemList = new ArrayList<ItemDataModel>();
        itemList.add(new ItemDataModel(
                0,
                "運動用品",
                1,
                "箱子", 1000,
                null,
                1000,
                "備註"
        ));

        request.items = itemList;

        var obj = client.createInvoice(request);

        System.out.println(objectMapper.writeValueAsString(obj));

    }

    @Test
    public void queryInvoiceTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new QueryInvoiceInfoRequest();

        request.relateNumber = "0.6296905444570663";

        var obj = client.queryInvoice(request);
        System.out.println(objectMapper.writeValueAsString(obj));
    }


    @Test
    public void invalidInvoiceTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new InvalidInvoiceRequest();

        request.invoiceNo = "VJ70001239";
        request.invoiceDate = "2022-05-19";
        request.reason = "作廢測試";

        var obj = client.invalidInvoice(request);
        System.out.println(objectMapper.writeValueAsString(obj));
    }

    @Test
    public void createAllowanceTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new IssuingAllowanceRequest();

        request.invoiceNo = "VJ21008302";
        request.invoiceDate = "2022-05-28";
        request.allowanceNotify = "N";
        request.customerName = "Mark";
        request.allowanceAmount = 50;
        var itemList = new ArrayList<ItemDataModel>();
        itemList.add(new ItemDataModel(
                0,
                "運動用品",
                1,
                "箱子",
                50,
                null,
                50,
                "備註"
        ));

        request.items = itemList;


        var obj = client.createAllowance(request);
        System.out.println(objectMapper.writeValueAsString(obj));
    }

    @Test
    public void createAllowanceByCollegiateTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new IssuingAllowanceByCollegiateRequest();

        request.invoiceNo = "VJ21052853";
        request.invoiceDate = "2022-06-11";
        request.allowanceNotify = "E";
        request.notifyMail = "test@ecpay.com.tw";
        request.customerName = "Mark";
        request.allowanceAmount = 50;
        var itemList = new ArrayList<ItemDataModel>();
        itemList.add(new ItemDataModel(
                0,
                "運動用品",
                1,
                "箱子",
                50,
                null,
                50,
                "備註"
        ));

        request.items = itemList;


        var obj = client.createAllowanceByCollegiate(request);
        System.out.println(objectMapper.writeValueAsString(obj));
    }


    @Test
    public void InvalidAllowanceTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new InvalidAllowanceRequest();

        request.invoiceNo = "VJ70006673";
        request.allowanceNo = "2022062321401329";
        request.reason = "test";


        var obj = client.invalidAllowance(request);
        System.out.println(objectMapper.writeValueAsString(obj));
    }

    @Test
    public void InvalidAllowanceByCollegiateTest() throws JsonProcessingException {

        var client = new ECPayInvoiceClientImpl();

        var request = new InvalidAllowanceByCollegiateRequest();

        request.invoiceNo = "VJ70009780";
        request.allowanceNo = "2022062317485597";
        request.reason = "test";


        var obj = client.invalidAllowanceByCollegiate(request);
        System.out.println(objectMapper.writeValueAsString(obj));
    }

}
