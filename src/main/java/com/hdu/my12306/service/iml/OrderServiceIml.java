package com.hdu.my12306.service.iml;


import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainO;
import com.hdu.my12306.mapper.OrderMapper;
import com.hdu.my12306.mapper.TrainMapper;
import com.hdu.my12306.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class OrderServiceIml implements OrderService {
    @Autowired
    private TrainMapper trainMapper;
    @Autowired
    private OrderMapper  orderMapper;
    @Override
    public void order(String tNo, String pPhone) {
        Integer num = trainMapper.num(tNo);
        if(num>0){
            trainMapper.subNum(tNo);
            orderMapper.order(tNo,pPhone);
        }

    }

    @Override
    public void refund(String tNo) {
        trainMapper.addNum(tNo);
        orderMapper.status(tNo);

    }

    @Override
    public List<TrainO> list(String pPhone) {
        return orderMapper.list(pPhone);
    }


}
