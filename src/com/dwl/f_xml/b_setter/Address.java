package com.dwl.f_xml.b_setter;

/**
 * Created by 杜文丽 on 8/4/2019 1:55 PM
 **/
public class Address {
    private String addr;
    private String tel;

    public Address() {
    }

    public Address(String addr, String tel) {
        this.addr = addr;
        this.tel = tel;
    }

    public String getAddr() {
        return addr;
    }

    public String getTel() {
        return tel;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
