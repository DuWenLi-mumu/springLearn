package com.dwl.f_xml.e_coll;

import java.util.*;

/**
 * Created by 杜文丽 on 8/4/2019 7:18 PM
 **/
public class CollData {
    private String[] arrayData;
    private List<String> listData;
    private Set<String> setData;
    private Map<String,String> mapData;
    private Properties propsData;

    public void setArrayData(String[] arrayData) {
        this.arrayData = arrayData;
    }

    public void setListData(List<String> listData) {
        this.listData = listData;
    }

    public void setSetData(Set<String> setData) {
        this.setData = setData;
    }

    public void setMapData(Map<String, String> mapData) {
        this.mapData = mapData;
    }

    public void setPropsData(Properties propsData) {
        this.propsData = propsData;
    }

    public String[] getArrayData() {
        return arrayData;
    }

    public List<String> getListData() {
        return listData;
    }

    public Set<String> getSetData() {
        return setData;
    }

    public Map<String, String> getMapData() {
        return mapData;
    }

    public Properties getPropsData() {
        return propsData;
    }

    @Override
    public String toString() {
        return "CollData{" +
                "arrayData=" + Arrays.toString(arrayData) +
                ", listData=" + listData +
                ", setData=" + setData +
                ", mapData=" + mapData +
                ", propsData=" + propsData +
                '}';
    }
}
