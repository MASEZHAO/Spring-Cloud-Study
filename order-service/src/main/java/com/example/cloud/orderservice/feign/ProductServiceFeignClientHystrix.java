package com.example.cloud.orderservice.feign;

import org.springframework.stereotype.Component;

/**
 * @author zhaoting
 * @date 2018/4/28 下午4:19
 */
@Component
public class ProductServiceFeignClientHystrix implements ProductServiceFeignClient {
    @Override
    public String productServiceHello(String name) {
        return "服务未注册，请稍后再试。。。。";
    }
}
