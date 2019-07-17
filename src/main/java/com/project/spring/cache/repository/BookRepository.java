package com.project.spring.cache.repository;

import com.project.spring.cache.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);

    Book getByIsbnToEvict(String isbn);

}