package com.dwl.f_xml.d_SpEL;

/**
 * Created by 杜文丽 on 8/4/2019 7:18 PM
 **/
public class Customer {
    private String cname;
    private Double pi;

    public Customer(String cname, Double pi) {
        this.cname = cname;
        this.pi = pi;
    }

    public Customer() {

    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public void setPi(Double pi) {
        this.pi = pi;
    }

    public String getCname() {
        return cname;
    }

    public Double getPi() {
        return pi;
    }

    @Override
    public String toString() {
        return "CollData{" +
                "cname=" + cname +
                ", pi=" + pi +
                '}';
    }
}
