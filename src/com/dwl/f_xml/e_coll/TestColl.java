package com.dwl.f_xml.e_coll;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 杜文丽 on 8/4/2019 7:18 PM
 **/
public class TestColl {
    public static void main(String[] args) {
        String xmlPath="com/dwl/f_xml/e_coll/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        CollData collData = (CollData) applicationContext.getBean("collDataId");
        System.out.println(collData);
    }
}
