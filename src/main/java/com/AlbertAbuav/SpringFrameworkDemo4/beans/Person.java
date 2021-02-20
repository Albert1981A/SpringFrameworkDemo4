package com.AlbertAbuav.SpringFrameworkDemo4.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
@NoArgsConstructor
public class Person {

    //@Value("123")
    @Value("${id}")
    private int id;
    //@Value("Moshe")
    @Value("${name}")
    private String name;
}
