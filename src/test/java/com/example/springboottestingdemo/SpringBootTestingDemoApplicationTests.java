package com.example.springboottestingdemo;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBootTestingDemoApplicationTests {


    @Autowired
    private ApplicationContext context ;
    @Test
    void contextLoads() {
    }

}
