package com.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@ComponentScan(basePackages = "com.ssm",
//        useDefaultFilters = false,
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class)})
//public class SpringMVCConfig {
//}
@Configuration
@ComponentScan(basePackages = "com.ssm")
public class SpringMVCConfig {
}