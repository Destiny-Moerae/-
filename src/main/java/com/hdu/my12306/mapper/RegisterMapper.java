package com.hdu.my12306.mapper;

import com.hdu.my12306.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegisterMapper {

     User findByPhone(String phone);

     void register(User user);
}
