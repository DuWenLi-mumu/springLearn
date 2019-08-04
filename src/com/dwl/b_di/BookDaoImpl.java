package com.dwl.b_di;

/**
 * Created by 杜文丽 on 8/2/2019 6:33 PM
 **/
public class BookDaoImpl implements BookDao {
    @Override
    public void addBook() {
        System.out.println("di add book");
    }
}
