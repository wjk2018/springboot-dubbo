package com.wjk.comsumer.mock;

import com.wjk.provide.api.IProvider;
import com.wjk.provider.bean.User;

/**
 * @ClassName MockProvider
 * @Description
 * @Author Wangjunkai
 * @Date 2021/4/13 18:15
 **/

public class MockProvider implements IProvider {

    @Override
    public String hello(User user) {
        return "provider 宕机";
    }
}