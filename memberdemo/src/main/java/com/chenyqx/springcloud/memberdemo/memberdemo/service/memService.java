package com.chenyqx.springcloud.memberdemo.memberdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName : memService
 * @Description : 会员服务
 * @Author : chenyqx
 * @Date: 2020-10-02 19:31
 */
@RestController
public class memService {
//    @Autowired
//    private RestTemplate restTemplate;
//    @RequestMapping("/memTest")
//    public String memTest(){
//        String str = restTemplate.getForObject("http://order-server/orderTest",String.class);
//        return str;
//    }
}
