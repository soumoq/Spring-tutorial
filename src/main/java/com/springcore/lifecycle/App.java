package com.springcore.lifecycle;

import com.springcore.ci.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
    Somasa person = (Somasa) context.getBean("s1");
    System.out.println(person);

    Papsi p1 = (Papsi) context.getBean("p1");
    System.out.println(p1);

    Cola c1 = (Cola) context.getBean("c1");
    System.out.println(c1);

    context.registerShutdownHook();
  }
}
