package com.baizhi.service;

import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService{

    @Resource
    private EmpDAO empDAO;

    @Override
    public List<Emp> findAll() {
        List<Emp> emps = empDAO.selectAll();
        return emps;
    }

    @Override
    public Emp findOne(String id) {
        Emp emp = empDAO.selectOne(id);
        return emp;
    }

    @Override
    public void add(Emp emp) {
        emp.setId(UUID.randomUUID().toString());
        empDAO.insert(emp);
    }

    @Override
    public void update(Emp emp) {
        empDAO.update(emp);
    }

    @Override
    public void delete(String id) {
        empDAO.delete(id);
    }
}
