package com.springcore.ci;

import java.util.List;

public class Person {
  private String name;
  private int id;
  private Certificate cId;
  private List<String> phone;

  @Override public String toString() {
    return "Person{" + "name='" + name + '\'' + ", id=" + id + ", cId=" + cId + ", phone=" + phone + '}';
  }

  public Person(String name, int id, Certificate cId, List<String> phone) {
    this.name = name;
    this.id = id;
    this.cId = cId;
    this.phone = phone;
  }
}
