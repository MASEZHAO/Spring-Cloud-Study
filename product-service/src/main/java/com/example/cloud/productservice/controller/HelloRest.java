package com.example.cloud.productservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaoting
 * @date 2018/4/13 下午3:05
 */
@RestController
public class HelloRest {

    private static Logger logger = LoggerFactory.getLogger(HelloRest.class);

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<String> hello(@RequestParam("name") String name){
        logger.info("called by product service method hello....");
        return new ResponseEntity<String>("hello " + name + " product service...", HttpStatus.OK);
    }
}
