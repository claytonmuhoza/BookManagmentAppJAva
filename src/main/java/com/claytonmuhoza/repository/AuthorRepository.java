package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Author;

import java.util.List;

public interface AuthorRepository extends DataRepository<Author, Integer> {
    public Author findByName(String name);
}

