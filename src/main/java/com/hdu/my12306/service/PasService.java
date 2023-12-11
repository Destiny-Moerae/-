package com.hdu.my12306.service;

import com.hdu.my12306.domain.Passenger;
import com.hdu.my12306.domain.User;

import java.util.List;

public interface PasService {
    void add(Passenger pas);
    Passenger findByPhone(Passenger pas);

    void delete(String phone);

    List<Passenger> findByUPhone(String uphone);

    void update1(Passenger pas);
}
