package com.haohere.ecpay.invoice.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.haohere.ecpay.invoice.models.base.BaseDataResponse;
import com.haohere.ecpay.invoice.models.request.ItemDataModel;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author haohao
 * @date 2022/5/14
 */
public class QueryInvoiceInfoResponse extends BaseDataResponse {

    /**
     * 特店編號
     */
    @JsonProperty(value = "IIS_Mer_ID")
    public String iisMerID;

    /**
     * 發票號碼
     */
    @JsonProperty(value = "IIS_Number")
    public String iisNumber;

    /**
     * 特店自訂編號
     */
    @JsonProperty(value = "IIS_Relate_Number")
    public String iisRelateNumber;

    /**
     * 客戶編號
     */
    @JsonProperty(value = "IIS_Customer_ID")
    public String iisCustomerID;

    /**
     * 買方統編 (補充說明: 0000000000 代表沒有統編 )
     */
    @JsonProperty(value = "IIS_Identifier")
    public String iisIdentifier;

    /**
     * 客戶名稱
     */
    @JsonProperty(value = "IIS_Customer_Name")
    public String iisCustomerName;

    /**
     * 客戶地址
     */
    @JsonProperty(value = "IIS_Customer_Addr")
    public String iisCustomerAddr;

    /**
     * 客戶電話
     */
    @JsonProperty(value = "IIS_Customer_Phone")
    public String iisCustomerPhone;

    /**
     * 客戶電子信箱
     */
    @JsonProperty(value = "IIS_Customer_Email")
    public String iisCustomerEmail;

    /**
     * 通關方式
     */
    @JsonProperty(value = "IIS_Clearance_Mark")
    public String iisClearanceMark;

    /**
     * 發票種類
     */
    @JsonProperty(value = "IIS_Type")
    public String iisType;

    /**
     * 發票類別
     */
    @JsonProperty(value = "IIS_Category")
    public String iisCategory;

    /**
     * 課稅別
     */
    @JsonProperty(value = "IIS_Tax_Type")
    public String iisTaxType;

    /**
     * 特種稅額類別
     */
    @JsonProperty(value = "SpecialTaxType")
    public int specialTaxType;

    /**
     * 稅率
     */
    @JsonProperty(value = "IIS_Tax_Rate")
    public BigDecimal iisTaxRate;

    /**
     * 稅金
     */
    @JsonProperty(value = "IIS_Tax_Amount")
    public int iisTaxAmount;

    /**
     * 發票金額
     */
    @JsonProperty(value = "IIS_Sales_Amount")
    public String iisSalesAmount;

    /**
     * 發票檢查碼
     */
    @JsonProperty(value = "IIS_Check_Number")
    public String iisCheckNumber;

    /**
     * 載具類別
     */
    @JsonProperty(value = "IIS_Carrier_Type")
    public String iisCarrierType;

    /**
     * 載具編號
     */
    @JsonProperty(value = "IIS_Carrier_Num")
    public String iisCarrierNum;

    /**
     * 捐款單位捐贈碼
     */
    @JsonProperty(value = "IIS_Love_Code")
    public String iisLoveCode;

    /**
     * 發票開立 IP
     */
    @JsonProperty(value = "IIS_IP")
    public String iisIP;

    /**
     * 發票開立時間
     */
    @JsonProperty(value = "IIS_Create_Date")
    public String issCreateDate;

    /**
     * 發票開立狀態
     */
    @JsonProperty(value = "IIS_Issue_Status")
    public String iisIssueStatus;

    /**
     * 發票作廢狀態
     */
    @JsonProperty(value = "IIS_Invalid_Status")
    public String iisInvalidStatus;

    /**
     * 發票上傳狀態
     */
    @JsonProperty(value = "IIS_Upload_Status")
    public String iisUploadStatus;

    /**
     * 發票上傳時間
     */
    @JsonProperty(value = "IIS_Upload_Date")
    public String iisUploadDate;

    /**
     * 發票上傳後接收狀態
     */
    @JsonProperty(value = "IIS_Turnkey_Status")
    public String iisTurnkeyStatus;

    /**
     * 折讓剩餘金額
     */
    @JsonProperty(value = "IIS_Remain_Allowance_Amt")
    public String iisRemainAllowanceAmt;

    /**
     * 列印旗標
     */
    @JsonProperty(value = "IIS_Print_Flag")
    public String iisPrintFlag;

    /**
     * 中獎期標
     */
    @JsonProperty(value = "IIS_Award_Flag")
    public String iisAwardFlag;

    /**
     * 中獎種類
     */
    @JsonProperty(value = "IIS_Award_Type")
    public String iisAwardType;

    /**
     * 隨機碼
     */
    @JsonProperty(value = "IIS_Random_Number")
    public String iisRandomNumber;

    /**
     * 發票備註
     */
    @JsonProperty(value = "InvoiceRemark")
    public String invoiceRemark;

    /**
     * 顯示電子發票 QRCODE左邊用
     */
    @JsonProperty(value = "QRCode_Left")
    public String qrCodeLeft;

    /**
     * 顯示電子發票 QRCODE右邊用
     */
    @JsonProperty(value = "QRCode_Right")
    public String qrCodeRight;

    /**
     * 顯示電子發票 BARCODE
     */
    @JsonProperty(value = "PosBarCode")
    public String posBarCode;

    /**
     * 發票項目
     */
    @JsonProperty(value = "Items")
    public List<ItemDataModel> Items;
}
