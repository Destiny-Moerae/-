package com.hdu.my12306.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hdu.my12306.domain.User;


public interface LoginService extends IService<User> {
     User login1(User user);
}
