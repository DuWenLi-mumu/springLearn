package com.dwl.c_inject.b_static_factory;

/**
 * Created by 杜文丽 on 8/1/2019 4:37 PM
 **/
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("b_static_factory add user");
    }
}
