package com.hdu.my12306.service;

import com.hdu.my12306.domain.User;

public interface RegisterService {
    User findByPhone(String phone);

    void register(User user);
}
