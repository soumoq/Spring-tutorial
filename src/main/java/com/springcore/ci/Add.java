package com.springcore.ci;

public class Add {
  private int a;
  private int b;

  public Add(int a, int b) {
    System.out.println("call int constrictor");
    this.a = a;
    this.b = b;
  }

  public Add(double a, double b) {
    System.out.println("call double constrictor");
    this.a = (int) a;
    this.b = (int) b;
  }

  public int doAdd() {
    return a + b;
  }
}
