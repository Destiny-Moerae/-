package com.hdu.my12306.controller;

import com.hdu.my12306.domain.Result;
import com.hdu.my12306.domain.User;
import com.hdu.my12306.service.iml.RegisterServiceIml;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Tag(name = "注册", description = "注册.")
public class RegisterController {
    @Autowired
    private RegisterServiceIml registerServiceIml;
    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        User u = registerServiceIml.findByPhone(user.getUPhone());
        log.info(user.toString());
        log.info("{}",u);
        if(u == null)
        {
            String password = user.getUPwd();
            String s1 = DigestUtils.md5DigestAsHex(password.getBytes());
            user.setUPwd(s1);
            registerServiceIml.register(user);
            return Result.success();}
        else{
        return Result.error("PHONE_EXISTED");}

}}
