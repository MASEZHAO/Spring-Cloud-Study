package com.example.cloud.loadbalanceservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhaoting
 * @date 2018/4/17 下午2:46
 */
@RestController
public class LoadbalanceController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/product/hello", method = RequestMethod.GET)
    public String productHello(){
        return restTemplate.getForEntity("http://PRODUCT-SERVICE/hello", String.class).getBody();
    }

    @RequestMapping(value = "/order/hello", method = RequestMethod.GET)
    public String orderHello(){
        return restTemplate.getForEntity("http://ORDER-SERVICE/hello", String.class).getBody();
    }
}
