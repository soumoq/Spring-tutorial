package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpApp {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("collection-config.xml");
    Emp emp1 = (Emp) context.getBean("Emp1");
    System.out.println(emp1.getName());
    emp1.getAddresses().forEach(System.out::println);
    emp1.getPhones().forEach(System.out::println);
    emp1.getCourses().forEach((k, v) -> {
      System.out.println(k + " : " + v);
    });
  }
}
