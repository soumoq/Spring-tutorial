package com.springcore.lifecycle;

public class Somasa {
  private String price;

  public Somasa() {
  }

  @Override public String toString() {
    return "Somasa{" + "price='" + price + '\'' + '}';
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public void init(){
    System.out.println("inside init");
  }
  public void destroy(){
    System.out.println("inside destroy");
  }
}
