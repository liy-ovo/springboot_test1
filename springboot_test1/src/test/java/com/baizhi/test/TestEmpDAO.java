package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.EmpDAO;
import com.baizhi.entity.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestEmpDAO {
    @Resource
    private EmpDAO empDAO;

    @Test
    public void testSelectAll(){
        List<Emp> emps = empDAO.selectAll();
        for (Emp emp : emps) {
            System.out.println(emp);
        }
    }
}
