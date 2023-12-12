package com.hdu.my12306.service.iml;

import com.hdu.my12306.domain.User;
import com.hdu.my12306.mapper.LoginMapper;
import com.hdu.my12306.service.LoginService;
import com.hdu.my12306.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Slf4j
@Service
public class LoginServiceIml implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public User login1(User user) {

        return loginMapper.login1(user);
    }
}