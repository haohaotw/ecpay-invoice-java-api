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

    public String getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(String merchantID) {
        this.merchantID = merchantID;
    }

    public String getRelateNumber() {
        return relateNumber;
    }

    public void setRelateNumber(String relateNumber) {
        this.relateNumber = relateNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerIdentifier() {
        return customerIdentifier;
    }

    public void setCustomerIdentifier(String customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddr() {
        return customerAddr;
    }

    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getClearanceMark() {
        return clearanceMark;
    }

    public void setClearanceMark(String clearanceMark) {
        this.clearanceMark = clearanceMark;
    }

    public String getPrint() {
        return print;
    }

    public void setPrint(String print) {
        this.print = print;
    }

    public String getDonation() {
        return donation;
    }

    public void setDonation(String donation) {
        this.donation = donation;
    }

    public String getLoveCode() {
        return loveCode;
    }

    public void setLoveCode(String loveCode) {
        this.loveCode = loveCode;
    }

    public String getCarrierType() {
        return carrierType;
    }

    public void setCarrierType(String carrierType) {
        this.carrierType = carrierType;
    }

    public String getCarrierNum() {
        return carrierNum;
    }

    public void setCarrierNum(String carrierNum) {
        this.carrierNum = carrierNum;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public int getSpecialTaxType() {
        return specialTaxType;
    }

    public void setSpecialTaxType(int specialTaxType) {
        this.specialTaxType = specialTaxType;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int salesAmount) {
        this.salesAmount = salesAmount;
    }

    public String getInvoiceRemark() {
        return invoiceRemark;
    }

    public void setInvoiceRemark(String invoiceRemark) {
        this.invoiceRemark = invoiceRemark;
    }

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public int getVat() {
        return vat;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }

    public List<ItemDataModel> getItems() {
        return items;
    }

    public void setItems(List<ItemDataModel> items) {
        this.items = items;
    }
}
