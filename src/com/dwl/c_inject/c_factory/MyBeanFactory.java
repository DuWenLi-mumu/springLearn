package com.dwl.c_inject.c_factory;

/**
 * Created by 杜文丽 on 8/2/2019 8:08 PM
 *
 * 实例工厂 所有方法非静态
 **/
public class MyBeanFactory {
    public UserServiceImpl createService(){
        return new UserServiceImpl();
    }
}
