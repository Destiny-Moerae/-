package com.hdu.my12306.mapper;

import com.hdu.my12306.domain.Passenger;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PasMapper {
    @Select("select * from passenger where p_phone=#{pPhone}")
    Passenger findByPhone(Passenger pas);

    @Insert("INSERT INTO passenger(p_phone, u_phone, p_type, p_idcard, p_name) VALUES (#{pPhone},#{uPhone},#{pType},#{pIdcard},#{pName})")
    void add(Passenger user);

    @Delete("delete from passenger where p_phone=#{pPhone}")
    void delete(String pPhone);

    @Select("select * from passenger where u_phone=#{uPhone}")
    List<Passenger> findByUPhone(String uPhone);

    @Update("update passenger set p_type=#{pType} where p_phone=#{pPhone}")
    void update1(Passenger pas);
}
