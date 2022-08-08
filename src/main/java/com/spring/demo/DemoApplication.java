package com.spring.demo;

import com.spring.demo.config.ApplicationConfig;
import com.spring.demo.component.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserService userService= (UserService) annotationConfigApplicationContext.getBean(UserService.class);
       // userService.test();
        userService.hello();
    }

}
