package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 该注释表示  此类为springboot入口类  整个项目中只能用一次
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao") //指定dao接口所在包
public class Application {
    public static void main(String[] args) {
        /**
         * 启动springboot应用
         * 参数1：入口类对象  参数2：main的参数
         */
        SpringApplication.run(Application.class,args);
    }
}
