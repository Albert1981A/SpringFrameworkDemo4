package com.AlbertAbuav.SpringFrameworkDemo4.beans;

import org.springframework.stereotype.Component;

@Component
public class Kobi implements Teacher{
    @Override
    public void info() {
        System.out.println("Hi I'm Kobi and I'm a teacher!");
    }
}
