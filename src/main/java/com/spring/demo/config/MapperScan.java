package com.spring.demo.config;

import com.spring.demo.mybatis.MybatisImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import(MybatisImportBeanDefinitionRegistrar.class)
public @interface MapperScan {
     String value() default "";
}
