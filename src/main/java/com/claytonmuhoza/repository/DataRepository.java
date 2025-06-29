package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Author;

import java.util.List;

public interface DataRepository <T, I> {
    public List<T> findAll();
    public T findById(I id);
    public boolean save(I id, T data);
    public boolean delete(I id);
}
