package com.dwl.g_annotation.a_ioc;

import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

/**
 * Created by 杜文丽 on 8/1/2019 4:37 PM
 **/
@Component("userServiceId")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("g_annotation.a_ioc add user");
    }
}
