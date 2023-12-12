package com.hdu.my12306;


import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        hashOperations.put("001","age","19");

        Object name1 = hashOperations.get("001", "name");
        System.out.println(name1);

        Set keys = hashOperations.keys("001");
        for (Object key:keys
             ) {
            System.out.println(key);

        }
        List values = hashOperations.values("001");
        for (Object value:values
             ) {
            System.out.println(value);

        }
        System.out.println("^^^^^^^^");
        ListOperations listOperations = redisTemplate.opsForList();

        listOperations.leftPushAll("mylist", "a", "b", "c", "d");
        List<String> mylist = listOperations.range("mylist", 0, -1);
        for (String o : mylist) {
            System.out.println(o);
        }
        Long mylist1 = listOperations.size("mylist");
        System.out.println(mylist1);
        Object pop1 = listOperations.rightPop("mylist");
        System.out.println(pop1);
    }
    @Test
    public void test2(){
        SetOperations setOperations = redisTemplate.opsForSet();
        setOperations.add("myset","yaoming","wangda","songruixin");
        Long size = setOperations.size("myset");
        int i = size.intValue();
        Set<String> members = setOperations.members("myset");
        System.out.println(i);
        for (String member : members) {
            System.out.println(member);
        }
        setOperations.remove("myset","yaoming");
        System.out.println(members);
        setOperations.add("myset","wangda","wangda","libai");
        for (String member : members) {
            System.out.println(member);
        }


    }
    @Test
    public void test3(){
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();
        zSetOperations.add("kk","a", 1.0);
        zSetOperations.add("kk","b", 2.0);
        zSetOperations.add("kk","b", 3.0);
        zSetOperations.add("kk","c", 4.0);
        Long kk = zSetOperations.size("kk");
        System.out.println(kk);
        Set<String> kk1 = zSetOperations.range("kk",0,-1);
        for (String s : kk1) {
            System.out.println(s);
        }

    }
    @Test
    public void test4(){
        Set keys = redisTemplate.keys("*");
        for (Object key : keys) {
            System.out.println(key);
        }
        Boolean myset = redisTemplate.hasKey("myset");
        System.out.println(myset);
    }
    @Test
    public void test5(){
        String password = "ebaa123";
        String s1 = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(s1);
    }
}
