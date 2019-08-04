package com.dwl.g_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by 杜文丽 on 8/4/2019 8:33 PM
 **/
@Controller("studentActionId")
public class StudentAction {
    @Autowired //默认按照类型注入
    private StudentService studentService;
    public void execution(){
        studentService.addStudent();
    }
}
