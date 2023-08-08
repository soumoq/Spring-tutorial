package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("reference-config.xml");
    A a = (A) context.getBean("aref");
    System.out.println(a);

  }
}
