package com.hdu.my12306.controller;

import com.hdu.my12306.domain.Result;


import com.hdu.my12306.domain.User;

import com.hdu.my12306.service.iml.LoginServiceIml;
import com.hdu.my12306.utils.JwtUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@Slf4j
@RestController

@Tag(name = "登录", description = "登录/登出")
public class LoginController {
    @Autowired
    private LoginServiceIml loginServiceIml;

    @PostMapping("/login")
    public Result login(@RequestBody User user)
    {
        log.info("...{}",user);

        User u = loginServiceIml.login1(user);
        log.info("。。。{}",u);
        //登陆成功，生成令牌，下发令牌
        if(u !=null)
        {
            Map<String, Object> claims = new HashMap<>();

            claims.put("uPhone",user.getUPhone());
            claims.put("uPwd",user.getUPwd());
            String jwt = JwtUtils.generateJwt(claims);
            return Result.success(jwt);
        }
        //登陆失败，返回错误信息
        return Result.error("NOT_LOGIN");
    }
    @PostMapping("/logout")
    public Result logout(){

        return Result.success();
    }
}
