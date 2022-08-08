package com.spring.demo.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSession;
import org.springframework.beans.factory.FactoryBean;


public class MybatisFactoryBean implements FactoryBean {

    private Class  classInterface;

    private DefaultSqlSession sqlSession;

    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        this.sqlSession = (DefaultSqlSession)sqlSessionFactory.openSession();
        sqlSession.getConfiguration().addMapper(classInterface);
    }

    public MybatisFactoryBean(Class<?> classInterface) {
        this.classInterface = classInterface;
    }

    @Override
    public Object getObject() throws Exception {
        return  sqlSession.getMapper(classInterface);
    }

    @Override
    public Class<?> getObjectType() {
        return classInterface;
    }
}
