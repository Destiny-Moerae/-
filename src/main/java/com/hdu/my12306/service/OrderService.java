package com.hdu.my12306.service;


import com.hdu.my12306.domain.Train;
import com.hdu.my12306.domain.TrainO;

import java.util.List;

public interface OrderService {
    void order(String tNo, String pPhone);

    void refund(String tNo);

    List<TrainO> list(String pPhone);
}
