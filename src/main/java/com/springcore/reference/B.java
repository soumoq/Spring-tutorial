package com.springcore.reference;

public class B {
  @Override public String toString() {
    return "B{" + "y=" + y + '}';
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public B() {
  }

  private int y;
}
