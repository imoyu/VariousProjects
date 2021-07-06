package com.ssm.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.io.IOException;

@Configuration
@ComponentScan(basePackages = "com.ssm.service")
public class ApplicationContext {

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/stu?serverTimezone=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("admin");
        return dataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSession() throws IOException {
        SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
        sqlSession.setTypeAliasesPackage("com.ssm.entity");
        sqlSession.setDataSource(dataSource());
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSession.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return sqlSession;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.ssm.mapper");
        return mapperScannerConfigurer;
    }
}
