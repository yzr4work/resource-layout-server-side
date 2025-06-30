package com.yzr.resource.layout.background.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisConfig {
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(factory);

        // 设置Key的序列化
        template.setKeySerializer(new StringRedisSerializer());

        // 设置Value的序列化（JSON格式）
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());

        // 设置Hash Key的序列化
        template.setHashKeySerializer(new StringRedisSerializer());

        // 设置Hash Value的序列化
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());

        template.afterPropertiesSet();
        return template;
    }

}
