package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Resource
    private EmpService empService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Emp> queryAll(){
        return empService.findAll();
    }
}
