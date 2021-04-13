package com.wjk;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ComsumerApp
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/10 1:05
 **/
@SpringBootApplication
@EnableDubbo
public class ComsumerApp {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerApp.class);
    }

}