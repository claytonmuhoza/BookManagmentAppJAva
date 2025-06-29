package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Author;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class AuthorRepositoryLocal extends DataRepositoryLocal<Author, Integer> implements AuthorRepository {
     @Override
    public Author findByName(String name) {
        for (Author author : this.findAll()) {
            if(author.getFullName().equals(name)){
                return author;
            }
        }
        return null;
    }


}
