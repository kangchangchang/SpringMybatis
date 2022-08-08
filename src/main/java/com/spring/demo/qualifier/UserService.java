package com.spring.demo.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
//    @Autowired
//    @Random
    private LoadBalance loadBalance;
    public void test() {
        System.out.println(loadBalance);
    }
}