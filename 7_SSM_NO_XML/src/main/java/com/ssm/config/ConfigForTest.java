package com.ssm.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Cat.class)
public class ConfigForTest {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    @Qualifier("xxx")
    public Cat cat2() {
        return new Cat();
    }


}
