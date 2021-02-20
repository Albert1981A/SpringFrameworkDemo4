package com.AlbertAbuav.SpringFrameworkDemo4.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Roni implements Teacher{
    @Override
    public void info() {
        System.out.println("Hi I'm Roni and I'm a teacher!");
    }
}
