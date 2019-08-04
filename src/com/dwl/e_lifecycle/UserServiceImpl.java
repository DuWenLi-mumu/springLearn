package com.dwl.e_lifecycle;

/**
 * Created by 杜文丽 on 8/1/2019 4:37 PM
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("e_lifecycle add user");
    }
    public void myInit(){
        System.out.println("初始化");
    }
    public void myDestory(){
        System.out.println("销毁");
    }
}
