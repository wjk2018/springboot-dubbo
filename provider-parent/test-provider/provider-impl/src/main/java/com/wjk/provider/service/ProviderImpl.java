package com.wjk.provider.service;

import com.wjk.annotation.WjkService;
import com.wjk.provide.api.IProvider;
import com.wjk.provider.bean.User;

/**
 * @ClassName ProviderImpl
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/10 0:34
 **/
@WjkService(protocol = "dubbo1", accesslog = "true")
public class ProviderImpl implements IProvider {

    @Override
    public String hello(User user) {
        return "hello " + user.getName();
    }
}