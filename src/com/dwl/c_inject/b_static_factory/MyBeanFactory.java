package com.dwl.c_inject.b_static_factory;

/**
 * Created by 杜文丽 on 8/2/2019 8:08 PM
 *
 * 静态工厂
 **/
public class MyBeanFactory {
    public static UserServiceImpl createService(){
        return new UserServiceImpl();
    }
}
