package com.springcore.reference;

public class A {
  private B b;
  private int x;

  @Override public String toString() {
    return "A{" + "b=" + b + ", x=" + x + '}';
  }

  public A() {
  }

  public B getB() {
    return b;
  }

  public void setB(B b) {
    this.b = b;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }
}
