package com.wjk.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ComsumerApp
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/10 1:05
 **/
@EnableDubbo
@SpringBootApplication
public class ProviderApp {


    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class);
    }


}