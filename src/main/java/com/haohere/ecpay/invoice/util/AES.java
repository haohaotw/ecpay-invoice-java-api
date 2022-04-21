package com.haohere.ecpay.invoice.util;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * AES 加解密  PKCS7 CBC
 * @author haohao
 * @date 2022/4/21
 */
public class AES {

    /**
     * 加密資料
     * @param data
     * @param key
     * @param iv
     * @return
     */
    public static String encrypt(String data, String key, String iv) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(
                    Cipher.ENCRYPT_MODE,
                    new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"),
                    new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));
            byte[] result = cipher.doFinal(pkcs7padding(data, cipher.getBlockSize()));
            return Base64.getEncoder().encodeToString(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密資料
     * @param data
     * @param key
     * @param iv
     * @return
     */
    public static String decrypt(String data, String key,String iv) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(
                    Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "AES"),
                    new IvParameterSpec(iv.getBytes(StandardCharsets.UTF_8)));
            byte[] result = cipher.doFinal(Base64.getDecoder().decode(data));
            return new String(result, StandardCharsets.UTF_8).trim();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * PKCS7Padding 填充實現
     * @param content
     * @param blockSize
     * @return
     */
    private static byte[] pkcs7padding(String content, int blockSize) {
        byte[] contentBytes = content.getBytes(StandardCharsets.UTF_8);
        int pad = blockSize - (contentBytes.length % blockSize);
        byte padChr = (byte) pad;
        byte[] paddedBytes = new byte[contentBytes.length + pad];
        System.arraycopy(contentBytes, 0, paddedBytes, 0, contentBytes.length);
        for (int i = contentBytes.length; i < paddedBytes.length; i++) {
            paddedBytes[i] = padChr;
        }
        return paddedBytes;
    }
}
