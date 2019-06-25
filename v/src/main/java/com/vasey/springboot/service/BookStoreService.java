package com.vasey.springboot.service;

import com.vasey.springboot.domain.Book;

import java.util.List;

public interface BookStoreService {

    public void insert(Book book);
    public void delete(Long id);
    public  void update(Book book);
    public Book findById(Long id);
    public List<Book> findAll();




}