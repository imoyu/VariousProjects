package com.ssm.test_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PSVM {


    public static void main(String[] args) {
        ApplicationContext teaContext = new AnnotationConfigApplicationContext(TeaWebConfig.class);
        Teacher teacher = teaContext.getBean(Teacher.class);
        System.out.println("Test.invoke + : " + teacher.hashCode());
    }
}
