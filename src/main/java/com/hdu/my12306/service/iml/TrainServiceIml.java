package com.hdu.my12306.service.iml;

import com.hdu.my12306.domain.PageBean;
import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainAll;
import com.hdu.my12306.mapper.TrainMapper;
import com.hdu.my12306.service.TrainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    @Override
    public PageBean page(Integer page, Integer pageSize) {
        Long count = trainMapper.count();
        List<TrainAll> page1 = trainMapper.page((page - 1) * pageSize, pageSize);
        PageBean pageBean = new PageBean(count,page1);
        return pageBean;
    }
}
