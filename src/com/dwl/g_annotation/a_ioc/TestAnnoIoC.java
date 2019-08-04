package com.dwl.g_annotation.a_ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 杜文丽 on 8/1/2019 4:43 PM
 **/
public class TestAnnoIoC {
    public static void main(String[] args) {
        //从spring容器中获得
        //1.获得容器
        String xmlPath= "com/dwl/g_annotation/a_ioc/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        //2.获得内容 不需要自己new 全都是从spring容器获得
        UserService userService= (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();
    }

}
