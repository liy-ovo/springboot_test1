package com.baizhi.dao;

import java.util.List;

public interface BasicDAO<T> {
    public List<T> selectAll();
    public T selectOne(String id);
    public void insert(T t);
    public void update(T t);
    public void delete(String id);
}
