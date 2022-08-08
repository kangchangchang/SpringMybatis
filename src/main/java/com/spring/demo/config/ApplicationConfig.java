package com.spring.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.spring.demo.component.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;


@ComponentScan("com.spring.demo.component")
@Configuration
@MapperScan("com.spring.demo.mybatis")
public class ApplicationConfig {

    @Bean(autowire=Autowire.BY_TYPE)
	public UserService  userService(){
		UserService  userService=new UserService();
		return userService;
	}


	@Bean
	public SqlSessionFactory sqlSessionFactory() throws IOException {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			return sqlSessionFactory;
	}






}
