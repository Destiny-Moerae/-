package com.hdu.my12306.service.iml;

import com.hdu.my12306.domain.User;

import com.hdu.my12306.mapper.RegisterMapper;

import com.hdu.my12306.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceIml implements RegisterService {
    @Autowired
    private RegisterMapper registerMapper;
    public User findByPhone(String phone){
        return registerMapper.findByPhone(phone);
    }

    @Override
    public void register(User user) {
        registerMapper.register(user);

    }
}
