package com.claytonmuhoza.repository;

import com.claytonmuhoza.Model.Author;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class DataRepositoryLocal<T, I> implements DataRepository<T, I> {

    protected Map<I,T> datas = new HashMap<>();
    @Override
    public  T findById(I id) {
        return datas.get(id);
    }

    @Override
    public List<T> findAll() {
        return new ArrayList<>(datas.values());
    }
    @Override
    public boolean save(I id, T data) {
        return datas.put(id, data) == null;
    }

    @Override
    public boolean delete(I id) {
        return datas.remove(id) != null;
    }


}
