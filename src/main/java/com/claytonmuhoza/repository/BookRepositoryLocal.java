package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Book;

public class BookRepositoryLocal extends DataRepositoryLocal<Book, Integer>  implements BookRepository{
    @Override
    public Book findByTitle(String title) {
        for(Book book : findAll()){
            if(book.getTitle().equals(title)){
                return book;
            }
        }
        return null;
    }
}
