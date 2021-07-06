package com.ssm.test_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TeaWebConfig {

    @Bean
    public Teacher teacher() {
        return new Teacher();
    }

    @Bean
    public String equalsTeacher(Teacher teacher) {
        System.out.println("invoke others Bean's INSTANCE is " + teacher.hashCode());
        //使用teacher()模拟不同Bean之间的调用
//        System.out.println("invoke Constructor's INSTANCE is " + teacher().hashCode());
        return "万物基于MIUI";
    }
}