package com.hdu.my12306.service;
import com.hdu.my12306.domain.PageBean;
import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainAll;

import java.time.LocalDate;
import java.util.List;


public interface TrainService {


    List<Train> QuaryTrain(Train train);

    PageBean page(Integer page, Integer pageSize);
}
