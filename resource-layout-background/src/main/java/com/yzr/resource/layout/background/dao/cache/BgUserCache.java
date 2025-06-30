package com.yzr.resource.layout.background.dao.cache;

import com.yzr.resource.layout.tool.RedisLettuceTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
@Repository
public class BgUserCache {
    @Autowired
    private RedisLettuceTool redisTool;

    public BgUserCache() {
    }

    public String generateToken(String bgUserId){
        LocalDateTime now = LocalDateTime.now();
        String tokenOrigin = bgUserId + now.toString();
        String token = "";
        return "";
    }
}
