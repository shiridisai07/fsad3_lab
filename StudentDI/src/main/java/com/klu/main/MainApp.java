package com.klu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klu.model.Student;
import com.klu.config.AppConfig;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("---- XML Configuration ----");

        ApplicationContext xmlContext =
                new ClassPathXmlApplicationContext("applicationcontext.xml");

        Student s1 = (Student) xmlContext.getBean("student");
        s1.display();

        System.out.println("\n---- Annotation Configuration ----");

        ApplicationContext annContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s2 = annContext.getBean(Student.class);
        s2.display();
    }
}
