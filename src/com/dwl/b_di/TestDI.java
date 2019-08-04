package com.dwl.b_di;

import com.dwl.a_ioc.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by 杜文丽 on 8/1/2019 4:43 PM
 **/
public class TestDI {
    public static void main(String[] args) {
        //方法一 从spring容器中获得
//        String xmlPath="com/dwl/b_di/beans.xml";
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
//        BookService bookService= (BookService) applicationContext.getBean("bookServiceId");
//        bookService.addBook();
        //方法二 使用beanFactory 延迟加载数据 第一次调用getBean时实例化
//        String xmlPath="com/dwl/b_di/beans.xml";
//        BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource(xmlPath));
//        BookService bookService= (BookService) beanFactory.getBean("bookServiceId");
//        bookService.addBook();
    }

}
