package com.hdu.my12306.mapper;


import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface OrderMapper {

    @Insert("insert into order_form(t_no, p_phone, status) VALUES (#{tNo},#{pPhone},1)")
    void order(String tNo, String pPhone);
    @Update("update order_form set status=0 where t_no=#{tNo}")
    void status(String tNo);
    @Select("select t.* from train t,order_form o where o.p_phone=#{pPhone} and o.t_no=t.t_no and o.status=1")
    List<TrainO> list(String pPhone);
}
