package com.spring.demo.mybatis;

import com.spring.demo.config.MapperScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Map;

public class MybatisImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
      Map<String,Object> mapScan=  importingClassMetadata.getAnnotationAttributes(MapperScan.class.getName());
      String value= (String) mapScan.get("value");
      MybatisMapperScan mybatisMapperScan=new MybatisMapperScan(registry);
      mybatisMapperScan.addIncludeFilter(new TypeFilter(){

            @Override
            public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

                return true;
            }
        });
        mybatisMapperScan.doScan(value);
    }
}
