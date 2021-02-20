package com.AlbertAbuav.SpringFrameworkDemo4;

import com.AlbertAbuav.SpringFrameworkDemo4.beans.Cat;
import com.AlbertAbuav.SpringFrameworkDemo4.beans.Person;
import com.AlbertAbuav.SpringFrameworkDemo4.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringFrameworkDemo4Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringFrameworkDemo4Application.class, args);

		Person p1 = ctx.getBean(Person.class);
		System.out.println(p1);

		Cat c1 = ctx.getBean(Cat.class);
		System.out.println(c1);

		Student s1 = ctx.getBean(Student.class);
		System.out.println(s1);

	}

}
