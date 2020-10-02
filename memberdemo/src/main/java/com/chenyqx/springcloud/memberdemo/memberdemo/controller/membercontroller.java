package com.chenyqx.springcloud.memberdemo.memberdemo.controller;

import com.chenyqx.springcloud.memberdemo.memberdemo.service.OrderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : membercontroller
 * @Description : 会员接口
 * @Author : chenyqx
 * @Date: 2020-10-02 17:49
 */

@RestController
public class membercontroller {
    @Autowired
    private OrderFeign orderFeign;
    @RequestMapping("/memTest")
    public String memTest(){
        String str = orderFeign.orderTest();
        return str;
    }
}
