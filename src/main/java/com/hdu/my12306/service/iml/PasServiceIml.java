package com.hdu.my12306.service.iml;

import com.hdu.my12306.domain.Passenger;
import com.hdu.my12306.mapper.LoginMapper;
import com.hdu.my12306.mapper.PasMapper;
import com.hdu.my12306.service.PasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PasServiceIml implements PasService {
    @Autowired
    private PasMapper pasMapper;
    @Override
    public void add(Passenger pas) {
        pasMapper.add(pas);
    }
    @Override
    public Passenger findByPhone(Passenger pas){
        return pasMapper.findByPhone(pas);
    }

    @Override
    public void delete(String pPhone) {
        pasMapper.delete(pPhone);


    }

    @Override

    public List<Passenger> findByUPhone(String uPhone) {
        List<Passenger> p2 = pasMapper.findByUPhone(uPhone);
        log.info("{}",p2);
        return p2;
    }

    @Override
    public void update1(Passenger passenger) {
        pasMapper.update1(passenger);
    }
}
