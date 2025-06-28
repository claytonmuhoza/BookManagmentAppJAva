package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Author;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryJSON implements AuthorRepository {
    private File JsonFile;
    private List<Author> authors;
    public AuthorRepositoryJSON(){
        // we start by giving an empty list to authors for performance purpose
        authors = new ArrayList<>();
    }
    public AuthorRepositoryJSON(File JsonFile) {}
    @Override
    public List<Author> findAll() {
        return authors;
    }

    @Override
    public Author findById(int id) {
        for (Author author : authors) {
            if (author.getId() == id) {
                return author;
            }
        }
        return null;
    }

    @Override
    public Author findByName(String name) {
        for (Author author : authors) {
            if(author.getFullName().equals(name)){
                return author;
            }
        }
        return null;
    }

    @Override
    public void save(Author author) {

    }

    @Override
    public void delete(int id) {

    }
}
