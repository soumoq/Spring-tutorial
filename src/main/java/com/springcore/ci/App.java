package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ci-config.xml");
        Person person = (Person) context.getBean("person");

        Add add = (Add) context.getBean("add");
        System.out.println(add.doAdd());

  }
}
