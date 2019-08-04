package com.dwl.f_xml.c_p;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by 杜文丽 on 8/1/2019 4:43 PM
 **/
public class TestP {
    public static void main(String[] args) {
        //方法一 从spring容器中获得
        String xmlPath="com/dwl/f_xml/c_p/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        Person person= (Person) applicationContext.getBean("personId");
        System.out.println(person.getPname());

    }

}
