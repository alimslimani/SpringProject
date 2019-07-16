package com.project.spring.cache.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Book {

    private String isbn, title;

}