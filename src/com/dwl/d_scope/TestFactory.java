package com.dwl.d_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 杜文丽 on 8/2/2019 8:10 PM
 **/
public class TestFactory {
    public static void main(String[] args) {
        //自定义工厂
//        UserServiceImpl userId=MyBeanFactory.createService();
//        userId.addUser();
        //spring工厂
        String xmlPath="com/dwl/d_scope/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService= (UserService) applicationContext.getBean("userServiceId1");
        UserService userService2= (UserService) applicationContext.getBean("userServiceId1");
        userService.addUser();
        userService2.addUser();
        System.out.println(userService);
        System.out.println(userService2);
    }
}
