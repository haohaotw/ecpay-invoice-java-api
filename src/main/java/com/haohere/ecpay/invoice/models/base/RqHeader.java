package com.haohere.ecpay.invoice.models.base;

/**
 * @author haohao
 * @date 2022/4/13
 */
public class RqHeader {

    /**
     * 時間戳，格式為 Unix timestamp
     * 注意事項：
     * 若時間戳跟綠界接收到時間超過 10 分鐘時，交易會失敗無法進行
     */
    public String timestamp;

    /**
     * 串接規格文件版號
     */
    public String revision;
}
