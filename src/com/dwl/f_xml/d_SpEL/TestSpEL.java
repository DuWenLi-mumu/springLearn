package com.dwl.f_xml.d_SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 杜文丽 on 8/4/2019 7:18 PM
 **/
public class TestSpEL {
    public static void main(String[] args) {
        String xmlPath="com/dwl/f_xml/d_SpEL/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Customer customer= (Customer) applicationContext.getBean("customerId");
        System.out.println(customer);
    }
}
