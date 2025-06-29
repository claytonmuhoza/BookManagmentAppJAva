package com.claytonmuhoza.repository;


import com.claytonmuhoza.Model.Book;

public interface BookRepository extends DataRepository<Book, Integer> {
    public Book findByTitle(String title);
}
