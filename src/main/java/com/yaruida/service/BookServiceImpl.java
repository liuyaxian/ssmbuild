package com.yaruida.service;

import com.yaruida.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/***
 * @Description：
 * @Author: liu_y
 * @Date: 2022/9/30 09 :21
 */
public class BookServiceImpl implements BookService {


    // 组合dao service 代用dao 层，
    private BookService bookService;
    // 方法一 ： 使用set 方法， Spring 可以托管了
    // 方法二 ：    @Autowired 注解


    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public int addBook(Books book) {
        return bookService.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookService.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookService.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookService.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookService.queryAllBook();
    }
}
