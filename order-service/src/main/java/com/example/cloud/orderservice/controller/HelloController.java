package com.example.cloud.orderservice.controller;

import com.example.cloud.orderservice.feign.ProductServiceFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoting
 * @date 2018/4/13 下午2:32
 */
@RefreshScope
@RestController
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);


    @Value("${configParam}")
    private String configParam;

    @Autowired
    private ProductServiceFeignClient productServiceFeignClient;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> HelloOrder(@RequestParam("name") String name){
        System.out.println("获取配置信息：" + configParam + "-------");
        return new ResponseEntity<String>("hello " + configParam + " order service....", HttpStatus.OK);
    }


    @RequestMapping(value = "/product/hello", method = RequestMethod.GET)
    public String getHelloFromProductService(@RequestParam("name") String name){
        System.out.println("调用product服务");
        logger.info("order service calling product service.......");
        String result= productServiceFeignClient.productServiceHello(name);
        return "调用product服务:返回结果：" + result;
    }

}
