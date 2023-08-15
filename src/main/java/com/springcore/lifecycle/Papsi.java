package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Papsi implements InitializingBean, DisposableBean {
  private String price;

  @Override public String toString() {
    return "Papsi{" + "price='" + price + '\'' + '}';
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Papsi() {
  }

  @Override public void afterPropertiesSet() throws Exception {
    System.out.println("P Start init");
  }

  @Override public void destroy() throws Exception {
    System.out.println("P Start destroy");
  }
}
