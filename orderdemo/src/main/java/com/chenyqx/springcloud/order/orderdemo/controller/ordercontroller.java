package com.chenyqx.springcloud.order.orderdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ordercontroller
 * @Description : 订单接口
 * @Author : chenyqx
 * @Date: 2020-10-02 17:42
 */

@RestController
public class ordercontroller {
    @RequestMapping("orderTest")
    public String orderTest(){
        return "this is order";
    }
}
