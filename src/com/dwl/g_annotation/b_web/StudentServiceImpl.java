package com.dwl.g_annotation.b_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by 杜文丽 on 8/4/2019 8:39 PM
 **/
@Service
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    @Autowired //自动按照类型装配
    @Qualifier("studentDaoId") //按照名称进行装配
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentDao getStudentDao() {
        return studentDao;
    }

    @Override
    public void addStudent() {
        studentDao.save();
    }
}
