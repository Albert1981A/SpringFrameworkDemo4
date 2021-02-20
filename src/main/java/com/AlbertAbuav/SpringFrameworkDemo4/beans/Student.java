package com.AlbertAbuav.SpringFrameworkDemo4.beans;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@NoArgsConstructor
@Data
public class Student {

    @Value("12345")
    private int id;
    @Value("Gideon")
    private String name;
    @Value("English")
    private String profession;
    @Autowired
    @Qualifier("kobi")
    private Teacher teacher;

}
