package com.dwl.f_xml.b_setter;

/**
 * Created by 杜文丽 on 8/4/2019 1:54 PM
 **/
public class Person {
    private String pname;
    private Integer age;
    private Address homeAddr;
    private Address companyAddr;
    public Person() {
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHomeAddr(Address homeAddr) {
        this.homeAddr = homeAddr;
    }

    public void setCompanyAddr(Address companyAddr) {
        this.companyAddr = companyAddr;
    }



    public String getPname() {
        return pname;
    }

    public Integer getAge() {
        return age;
    }

    public Address getHomeAddr() {
        return homeAddr;
    }

    public Address getCompanyAddr() {
        return companyAddr;
    }
}
