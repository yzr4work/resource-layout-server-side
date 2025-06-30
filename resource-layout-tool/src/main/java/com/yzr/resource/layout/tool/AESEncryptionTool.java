package com.yzr.resource.layout.tool;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Base64;


public class AESEncryptionTool {
    public static void main(String[] args) throws Exception {
        // 1. 生成 AES 密钥（256位）需16位字符串
        SecretKey secretKey = new SecretKeySpec("1234567890abcdef".getBytes(),"AES");

        // 2. 明文
        String plainText = "Hello, AES 加密测试!";

        // 3. 加密
        String encryptedText = encrypt(plainText, secretKey);
        System.out.println("密文 (Base64): " + encryptedText);

        // 4. 解密
        String decryptedText = decrypt(encryptedText, secretKey);
        System.out.println("解密后: " + decryptedText);
    }

    // 生成 AES 密钥
    public static SecretKey generateAESKey(int keySize) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(keySize);
        return keyGen.generateKey();
    }

    // 加密方法
    public static String encrypt(String plainText, SecretKey secretKey) throws Exception {
        // 生成随机 IV
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // 初始化加密器
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);

        // 加密
        byte[] cipherText = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));

        // 合并 IV + 密文（IV 不需要保密，但需唯一）
        byte[] encryptedData = new byte[iv.length + cipherText.length];
        System.arraycopy(iv, 0, encryptedData, 0, iv.length);
        System.arraycopy(cipherText, 0, encryptedData, iv.length, cipherText.length);

        // 返回 Base64 编码的字符串
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    // 解密方法
    public static String decrypt(String encryptedText, SecretKey secretKey) throws Exception {
        // 解码 Base64
        byte[] encryptedData = Base64.getDecoder().decode(encryptedText);

        // 提取 IV（前16字节）
        byte[] iv = new byte[16];
        System.arraycopy(encryptedData, 0, iv, 0, iv.length);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // 提取实际密文（IV之后的部分）
        byte[] cipherText = new byte[encryptedData.length - iv.length];
        System.arraycopy(encryptedData, iv.length, cipherText, 0, cipherText.length);

        // 初始化解密器
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);

        // 解密
        byte[] decryptedBytes = cipher.doFinal(cipherText);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}