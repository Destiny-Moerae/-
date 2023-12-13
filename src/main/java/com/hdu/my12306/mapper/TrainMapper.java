package com.hdu.my12306.mapper;

import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainAll;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface TrainMapper {
    @Select("select * from train_info where s_s_name like concat('%', #{sSName},'%') " +
            "and e_s_name like concat('%',#{eSName},'%') " +
            "and start_time=#{startTime} and end_time=#{endTime}")
    List<Train> QuaryTrain(Train train);

    @Select("select count(*) from train_all_info")
    Long count();

    @Select("select * from train_all_info limit #{start},#{pageSize} ")
    List<TrainAll> page(Integer start,Integer pageSize);
    @Select("select num from train where t_no =#{tNo}")
    Integer num(String tNo);

    @Update("update train set num=num-1 where t_no=#{tNo}")
    void subNum(String tNo);

    @Update("update train set num=num+1 where t_no=#{tNo}")
    void addNum(String tNo);
}
