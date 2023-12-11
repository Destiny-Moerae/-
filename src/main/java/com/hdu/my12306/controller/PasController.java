package com.hdu.my12306.controller;

import com.hdu.my12306.domain.Passenger;
import com.hdu.my12306.domain.Result;
import com.hdu.my12306.domain.User;
import com.hdu.my12306.service.iml.PasServiceIml;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/pas")
@Tag(name = "passenger", description = "乘车人增删改查")
public class PasController {
    @Autowired
    private PasServiceIml pasServiceIml;
    //增加
    @PostMapping("/add")
    public Result add(@RequestBody Passenger passenger){
        Passenger p = pasServiceIml.findByPhone(passenger);

        if(p == null)
        {
            pasServiceIml.add(passenger);
            return Result.success();}
        else{
            return Result.error("PHONE_EXISTED");}

    }
    //删除
    @DeleteMapping("/{pPhone}")
    public Result delete(@PathVariable String pPhone){
        log.info("删除乘车人{}",pPhone);
        pasServiceIml.delete(pPhone);
        return Result.success();

    }
    //编辑
    @GetMapping("/{uPhone}")
    public Result getByPhone(@PathVariable String uPhone){
        log.info("{}",uPhone);
        List<Passenger> p1 = pasServiceIml.findByUPhone(uPhone);
        return Result.success(p1);
    }
    @PutMapping
    public Result update1(@RequestBody Passenger passenger){
        pasServiceIml.update1(passenger);
        return Result.success();
    }


}
