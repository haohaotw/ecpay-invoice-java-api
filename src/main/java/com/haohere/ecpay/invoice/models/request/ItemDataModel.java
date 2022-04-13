package com.haohere.ecpay.invoice.models.request;

/**
 * 商品細項
 * @author haohao
 * @date 2022/4/13
 */
public class ItemDataModel {

    /**
     * 商品序號
     */
    public int itemSeq ;

    /**
     * 商品名稱
     */
    public String itemName ;

    /**
     * 商品數量
     */
    public int itemCount ;

    /**
     * 商品單位
     */
    public String itemWord ;

    /**
     * 商品單價
     */
    public int itemPrice ;

    /**
     * 商品課稅別
     */
    public String itemTaxType ;

    /**
     * 商品合計
     */
    public int itemAmount ;

    /**
     * 商品備註
     */
    public String itemRemark ;
}
