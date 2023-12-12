package com.hdu.my12306.controller;

import com.hdu.my12306.domain.Result;
import com.hdu.my12306.domain.Train;
import com.hdu.my12306.service.iml.TrainServiceIml;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
public class TrainController {
    @Autowired
    private TrainServiceIml trainServiceIml;
    @GetMapping("/train")
    public Result QuaryTrainAll(@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startTime,
                                @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endTime,
                                @RequestParam String sSName,@RequestParam String eSName){
        Train train = new Train(sSName,eSName,startTime,endTime);
        log.info(train.toString());
        List<Train> trains = trainServiceIml.QuaryTrain(train);
        return Result.success(trains);
    }

}
