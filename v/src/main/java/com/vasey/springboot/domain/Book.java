package com.vasey.springboot.domain;

import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Objects;


public class Book implements Serializable {


    public Long id;
    public String name;
    public String writer;
    public String introduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", writer='" + writer + '\'' +
                ", introduction='" + introduction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book bookDao = (Book) o;
        return Objects.equals(id, bookDao.id) &&
                Objects.equals(name, bookDao.name) &&
                Objects.equals(writer, bookDao.writer) &&
                Objects.equals(introduction, bookDao.introduction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, writer, introduction);
    }

    public Book() {

    }

    public Book(Long id, String name, String writer, String introduction) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.introduction = introduction;
    }
}
