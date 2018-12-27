package com.google.springboot.configyamlDemo;

import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    // person name
    private String personName;

    private Integer age;

    private Map<String, Object> maps;

    private List<Object> lists;

    private Cat cat;


}
