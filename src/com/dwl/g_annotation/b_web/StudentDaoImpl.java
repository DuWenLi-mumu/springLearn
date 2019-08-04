package com.dwl.g_annotation.b_web;

import org.springframework.stereotype.Repository;

/**
 * Created by 杜文丽 on 8/4/2019 8:45 PM
 **/

@Repository("studentDaoId")
public class StudentDaoImpl implements StudentDao {
    @Override
    public void save() {
        System.out.println("save");
    }
}
