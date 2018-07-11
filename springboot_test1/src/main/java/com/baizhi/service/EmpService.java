package com.baizhi.service;

import com.baizhi.entity.Emp;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmpService {
    List<Emp> findAll();
    Emp findOne(String id);
    void add(Emp emp);
    void update(Emp emp);
    void delete(String id);
}
