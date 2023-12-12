package com.hdu.my12306.service.iml;

import com.hdu.my12306.domain.Train;
import com.hdu.my12306.mapper.TrainMapper;
import com.hdu.my12306.service.TrainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
@Slf4j
public class TrainServiceIml implements TrainService {
    @Autowired
    private TrainMapper trainMapper;

    @Override
    public List<Train> QuaryTrain(Train train) {
        return trainMapper.QuaryTrain(train);
    }
}
