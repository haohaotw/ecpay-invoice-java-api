package com.haohere.ecpay.invoice.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 商品細項
 *
 * @author haohao
 * @date 2022/4/13
 */
public class ItemDataModel {

    /**
     * 商品序號
     */
    @JsonProperty(value = "ItemSeq")
    public int itemSeq;

    /**
     * 商品名稱
     */
    @JsonProperty(value = "ItemName")
    public String itemName;

    /**
     * 商品數量
     */
    @JsonProperty(value = "ItemCount")
    public int itemCount;

    /**
     * 商品單位
     */
    public String itemWord;

    /**
     * 商品單價
     */
    public int itemPrice;

    /**
     * 商品課稅別
     */
    public String itemTaxType;

    /**
     * 商品合計
     */
    public int itemAmount;

    /**
     * 商品備註
     */
    public String itemRemark;

    public ItemDataModel() {

    }

    public ItemDataModel(int itemSeq, String itemName, int itemCount, String itemWord, int itemPrice, String itemTaxType, int itemAmount, String itemRemark) {
        this.itemSeq = itemSeq;
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.itemWord = itemWord;
        this.itemPrice = itemPrice;
        this.itemTaxType = itemTaxType;
        this.itemAmount = itemAmount;
        this.itemRemark = itemRemark;
    }

    public int getItemSeq() {
        return itemSeq;
    }

    public void setItemSeq(int itemSeq) {
        this.itemSeq = itemSeq;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getItemWord() {
        return itemWord;
    }

    public void setItemWord(String itemWord) {
        this.itemWord = itemWord;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemTaxType() {
        return itemTaxType;
    }

    public void setItemTaxType(String itemTaxType) {
        this.itemTaxType = itemTaxType;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(int itemAmount) {
        this.itemAmount = itemAmount;
    }

    public String getItemRemark() {
        return itemRemark;
    }

    public void setItemRemark(String itemRemark) {
        this.itemRemark = itemRemark;
    }
}
