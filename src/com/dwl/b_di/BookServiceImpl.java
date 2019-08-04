package com.dwl.b_di;

/**
 * Created by 杜文丽 on 8/2/2019 6:35 PM
 **/
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    //接口+setter（）
    public void setBookDao(BookDao bookDao){
        this.bookDao=bookDao;
    }
    @Override
    public void addBook() {
        this.bookDao.addBook();
    }
}
