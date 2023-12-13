package com.hdu.my12306.controller;

import com.hdu.my12306.domain.Result;

import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainO;
import com.hdu.my12306.service.iml.OrderServiceIml;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class OrderController {
    @Autowired
    private OrderServiceIml orderServiceIml;

//买票
    @GetMapping("/order")
    public Result order(String tNo,String pPhone){
        log.info("下单参数{}{}",tNo,pPhone);
        orderServiceIml.order(tNo,pPhone);
        return Result.success();
    }
//退票
    @GetMapping("/refund")
    public Result refund(String tNo){
        log.info("退票参数{}",tNo);
        orderServiceIml.refund(tNo);
        return Result.success();
    }


//查订单
    @GetMapping("/allorder")
    public Result list(String pPhone){
        List<TrainO> list = orderServiceIml.list(pPhone);
        return Result.success(list);
    }

}
