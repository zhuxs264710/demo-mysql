package com.example.demo.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter(DemoConfig.class)
public class MyBatisMapperScannerConfig {
 
 @Bean
 public MapperScannerConfigurer mapperScannerConfigurer(){
  MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
   mapperScannerConfigurer.setBasePackage("com.example.demo.mapper.*;com.gitee.sunchenbin.mybatis.actable.dao.*");
  mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
  return mapperScannerConfigurer;
 }
 
}
