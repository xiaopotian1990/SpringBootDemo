package com.xiaopotian.demo.controller;

import com.xiaopotian.demo.domain.Book;
import com.xiaopotian.demo.service.test2.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zoulu on 2018-01-15.
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @RequestMapping(method = RequestMethod.GET)
    @Cacheable(value = "book")
    public Book get() {
        //bookRepository.save(new Book("三国志", "1111111111111111111111"));
        return bookRepository.findByTitle("三国志");
    }
}
