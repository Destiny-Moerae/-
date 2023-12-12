package com.hdu.my12306;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = My12306Application.class)
public class jwtTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test_1(){
        redisTemplate.opsForValue().set("name","lihua");
        Object name = redisTemplate.opsForValue().get("name");
        System.out.println(name);
        redisTemplate.opsForValue().set("cup","china",1l, TimeUnit.SECONDS);
        Object cup = redisTemplate.opsForValue().get("cup");
        System.out.println(cup);
        System.out.println("----------");

        HashOperations hashOperations = redisTemplate.opsForHash();
        hashOperations.put("001","name","yaoming");

        Object name1 = hashOperations.get("001", "name");
        System.out.println(name1);


    }
}
