package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Author;

import java.util.List;

public interface AuthorRepository {
    public List<Author> findAll();
    public Author findById(int id);
    public Author findByName(String name);
    public void save(Author author);
    public void delete(int id);
}
