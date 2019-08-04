package com.dwl.e_lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


/**
 * Created by 杜文丽 on 8/4/2019 12:58 PM
 **/
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("前方法"+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("后方法"+beanName);
        //生成jdk代理

        //bean是目标对象
        //生成代理对象
        return Proxy.newProxyInstance(MyBeanFactory.class.getClassLoader(),
                bean.getClass().getInterfaces(),
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("开启事务");
                        //执行目标方法
                        Object object=method.invoke(bean,args);
                        System.out.println("提交事务");
                        return object;
                    }
                });
    }
}

