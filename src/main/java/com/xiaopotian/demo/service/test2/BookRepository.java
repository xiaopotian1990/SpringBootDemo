package com.xiaopotian.demo.service.test2;

import com.xiaopotian.demo.domain.Book;
import com.xiaopotian.demo.service.BaseRepository;

/**
 * Created by zoulu on 2018-01-15.
 */
public interface BookRepository extends BaseRepository<Book> {
    Book findByTitle(String title);
}
