package com.spring.demo.mybatis;

import org.apache.ibatis.annotations.Select;

public interface TestMapper {
    @Select("select 'hello' from  dual ")
    String select();
}
