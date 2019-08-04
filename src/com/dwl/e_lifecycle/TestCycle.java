package com.dwl.e_lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by 杜文丽 on 8/2/2019 8:10 PM
 **/
public class TestCycle {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //自定义工厂
//        UserServiceImpl userId=MyBeanFactory.createService();
//        userId.addUser();
        //spring工厂
        String xmlPath="com/dwl/e_lifecycle/beans.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService= (UserService) applicationContext.getBean("userServiceId");

        userService.addUser();
        //要求：1.容器必须close 销毁方法执行
        //applicationContext.getClass().getMethod("close").invoke(applicationContext);
        applicationContext.close();//必须是单例的
        //此方法接口中没有定义，实现类提供
    }
}
