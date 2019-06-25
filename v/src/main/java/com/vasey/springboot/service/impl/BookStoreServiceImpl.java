package com.vasey.springboot.service.impl;

import com.vasey.springboot.dao.BookDao;
import com.vasey.springboot.domain.Book;
import com.vasey.springboot.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookStoreServiceImpl implements BookStoreService {
    @Autowired(required = false)
    private BookDao bookDao;

//    @Autowired(required = false)
//    BookDao bookDao;/*
//    @Autowired(required = false)
//    BookStoreService bookStoreService;

   // public static Map<Long ,Book> BOOK_DB = new HashMap<>();

    @Override
    public void insert(Book book) {
/*
        book.setId(BOOK_DB.size()+1l);
        BOOK_DB.put(book.getId(),book);*/
      // bookStoreService.insert(book);
       bookDao.insert(book);


    }

    @Override
    public void delete(Long id) {
        /*return BOOK_DB.remove(id);*/
       // bookStoreService.delete(id);
        bookDao.delete(id);

    }

    @Override
    public void update(Book book) {
       /* BOOK_DB.put(book.getId(),book);*/
        //bookStoreService.update(book);
        bookDao.update(book);

    }

    @Override
    public Book findById(Long id) {
       /* return BOOK_DB.get(id);*/
       //return bookStoreService.findById(id);
        return bookDao.findById(id);
    }

    @Override
    public List<Book> findAll() {
        /*return new ArrayList<>(BOOK_DB.values());*/
        //return bookStoreService.findAll();
       /* if(bookDao.findAll()!=null){ return bookDao.findAll();}
        return null;*/
//       if(null!=bookDao)

       return  bookDao.findAll();


    }




}
