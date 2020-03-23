package com.bear.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot init
 *
 * @author xiaoxiong
 * @date 2020/3/14
 */
//一顶下面3个
@SpringBootApplication
@SpringBootConfiguration
@EnableAutoConfiguration
//扫描@Controller  @Component等
@ComponentScan
@ServletComponentScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}