package com.wjk.comsumer.controller;

import com.wjk.annotation.WjkReference;
import com.wjk.annotation.WjkService;
import com.wjk.provide.api.IProvider;
import com.wjk.provider.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName Comsumer
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/10 0:27
 **/
@RestController
public class Comsumer {

    @WjkReference(protocol = "dubbo")
    public IProvider iProvider;

    @Autowired
    ApplicationContext context;

    @GetMapping("/hello")
    public String hello(String name){
        return iProvider.hello(new User(name, 26));
    }

}