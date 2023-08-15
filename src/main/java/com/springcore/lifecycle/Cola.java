package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cola {
  private String price;

  public Cola() {
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  @Override public String toString() {
    return "Cola{" + "price='" + price + '\'' + '}';
  }

  @PostConstruct
  public void start(){
    System.out.println("C1 start");
  }

  @PreDestroy
  public void end(){
    System.out.println("C1 end");
  }
}
