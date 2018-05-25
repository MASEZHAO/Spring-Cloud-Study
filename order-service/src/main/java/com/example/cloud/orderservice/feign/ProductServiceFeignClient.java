package com.example.cloud.orderservice.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhaoting
 * @date 2018/4/28 下午4:18
 */
@FeignClient(value = "product-service", fallback = ProductServiceFeignClientHystrix.class)
public interface ProductServiceFeignClient {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String productServiceHello(@RequestParam("name") String name);
}
