package com.yzr.resource.layout.tool;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * 后台用户token工具类
 */
public class BgUserTokenRuleTool {
    private static final String SPLIT_KEY = "?";

    /**
     * 生成后台用户token
     * @param bgUserId 后台用户Id
     * @param bgUserAccount 后台用户账号
     * @param secretKey 秘钥
     * @return 密文token
     * @throws Exception
     */
    public static String GENERATE_BG_USER_TOKEN(String bgUserId, String bgUserAccount, String secretKey) throws Exception{
        LocalDateTime now = LocalDateTime.now();
        String plainText = bgUserAccount + SPLIT_KEY + now + SPLIT_KEY + bgUserId;
        return AESEncryptionTool.encrypt(plainText, secretKey);
    }

    /**
     * 解析后台用户token
     * @param encryptedText token
     * @param secretKey 秘钥
     * @return 后台用户信息
     * @throws Exception
     */
    public static Map<String, String> PARSE_BG_USER_TOKEN(String encryptedText, String secretKey)throws Exception{
        HashMap<String, String> hashMap = new HashMap<>(3);
        String plainText = AESEncryptionTool.encrypt(encryptedText, secretKey);
        String[] split = plainText.split(SPLIT_KEY);
        if (split.length != 3){
            throw new Exception("token内容格式错误");
        }
        hashMap.put("bgUserAccount", split[0]);
        hashMap.put("bgUserId",split[2]);
        hashMap.put("timestamp",split[1]);
        return hashMap;
    }
}
