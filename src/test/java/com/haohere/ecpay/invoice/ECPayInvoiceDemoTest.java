package com.haohere.ecpay.invoice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.haohere.ecpay.invoice.impl.ECPayInvoiceClientImpl;
import com.haohere.ecpay.invoice.models.request.IssuingInvoiceRequest;
import com.haohere.ecpay.invoice.models.request.ItemDataModel;
import com.haohere.ecpay.invoice.util.AES;
import org.junit.Assert;
import org.junit.Test;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/**
 * @author haohao
 * @date 2022/4/21
 */
public class ECPayInvoiceDemoTest {

    private final String KEY = "A123456789012345";
    private final String IV = "B123456789012345";

    @Test
    public void encryptDemoTest() {
        var expected = "7woM9RorZKAtXJRVccAb0qhHYm+5lnlhBzyfh5EZdNck7PacNsRHgv/Jvp//ajJidqcQcs0UmAgPQVjXQHeziw==";
        var source = "{\"Name\":\"Test\",\"ID\":\"A123456789\"}";
        var urlEncoder = URLEncoder.encode(source, StandardCharsets.UTF_8);
        var actual = AES.encrypt(urlEncoder, KEY, IV);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decryptDemoTest() {
        var expected = "{\"Name\":\"Test\",\"ID\":\"A123456789\"}";
        var source = "7woM9RorZKAtXJRVccAb0qhHYm+5lnlhBzyfh5EZdNck7PacNsRHgv/Jvp//ajJidqcQcs0UmAgPQVjXQHeziw==";
        var decrypt = AES.decrypt(source, KEY, IV);
        assert decrypt != null;
        var actual = URLDecoder.decode(decrypt, StandardCharsets.UTF_8);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testss() throws JsonProcessingException, ExecutionException, InterruptedException {

        var client = new ECPayInvoiceClientImpl();

        var request = new IssuingInvoiceRequest();

        request.customerEmail = "feef@ewf.com";
        request.setRelateNumber("2122DDW1");
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
        request.setSalesAmount(100);
        request.setVat("1");

        var itemList = new ArrayList<ItemDataModel>();
        itemList.add(new ItemDataModel(0, "運動用品", 1, "箱子", 100, null, 100, "備註"));

        request.items = itemList;

        var obj  = client.createInvoice(request);
        System.out.println(obj);
    }
}
