package com.hdu.my12306.mapper;

import com.hdu.my12306.domain.Train;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;


@Mapper
public interface TrainMapper {
    @Select("select * from train_info where s_s_name=#{sSName}")
    List<Train> QuaryTrain(Train train);


}
