package com.google.springboot;

import com.google.springboot.configyamlDemo.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootYamlconfigApplicationTests {

    @Resource
    private Person person;

    @Test
    public void contextLoads() {
        System.err.println(person);
    }

}

