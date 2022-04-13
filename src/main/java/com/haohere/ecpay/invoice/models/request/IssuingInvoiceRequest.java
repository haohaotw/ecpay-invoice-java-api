package com.haohere.ecpay.invoice.models.request;

import java.util.List;

/**
 * 開立發票請求
 * @author haohao
 * @date 2022/4/13
 */
public class IssuingInvoiceRequest {

    /**
     * 特店編號
     */
    public String merchantID;

    /**
     * 特店自訂編號 (需為唯一值不可重複使用，請勿使用特殊符號)
     */
    public String relateNumber;

    /**
     * 客戶編號
     */
    public String customerID;

    /**
     * 統一編號
     */
    public String customerIdentifier;

    /**
     * 客戶名稱
     */
    public String customerName;

    /**
     * 客戶地址
     */
    public String customerAddr;

    /**
     * 客戶手機號碼
     */
    public String customerPhone;

    /**
     * 客戶電子信箱
     */
    public String customerEmail;

    /**
     * 通關方式
     */
    public String clearanceMark;

    /**
     * 列印註記
     */
    public String print;

    /**
     * 捐贈註記
     */
    public String donation;

    /**
     * 捐贈碼
     */
    public String loveCode;

    /**
     * 載具類別
     */
    public String carrierType;

    /**
     * 載具編號
     */
    public String carrierNum;

    /**
     * 課稅類別
     */
    public String taxType;

    /**
     * 特種稅額類別
     */
    public int specialTaxType;

    /**
     * 發票總金額(含稅)
     */
    public int salesAmount;

    /**
     * 發票備註
     */
    public String invoiceRemark;

    /**
     * 字軌類別
     */
    public String invType;

    /**
     * 商品單價是否含稅
     */
    public int vat;

    /**
     * 商品細項
     */
    public List<ItemDataModel> items;
}
