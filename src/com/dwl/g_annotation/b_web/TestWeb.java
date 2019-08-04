package com.dwl.g_annotation.b_web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * Created by 杜文丽 on 8/1/2019 4:43 PM
 **/


public class TestWeb {
    public static void main(String[] args) {
        //从spring容器中获得
        String xmlPath= "com/dwl/g_annotation/b_web/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        StudentAction studentAction= (StudentAction) applicationContext.getBean("studentActionId");
        studentAction.execution();
    }

}
