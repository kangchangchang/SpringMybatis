package com.spring.demo.component;

import com.spring.demo.mybatis.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {


    @Autowired
    private TestMapper testMapper;


    public void hello(){
        System.out.println(testMapper.select());
    }


}
