package com.hdu.my12306.mapper;

import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainAll;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface TrainMapper {
    @Select("select * from train_info where s_s_name=#{sSName} and e_s_name=#{eSName} and start_time=#{startTime} and end_time=#{endTime}")
    List<Train> QuaryTrain(Train train);


    @Select("select count(*) from train_all_info")
    Long count();

    @Select("select * from train_all_info limit #{start},#{pageSize} ")
    List<TrainAll> page(Integer start,Integer pageSize);

}
