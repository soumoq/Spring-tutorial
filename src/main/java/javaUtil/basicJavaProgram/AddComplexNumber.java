package javaUtil.basicJavaProgram;

public class AddComplexNumber {
  public static void main(String[] args) {
    new Complex().add(new Complex(5, 8), new Complex(4, 10)).show();
  }
}

class Complex {
  int r;
  int i;

  Complex() {
  }

  Complex(int real, int imagine) {
    this.i = imagine;
    this.r = real;
  }

  public Complex add(Complex c1, Complex c2) {
    r = c1.r + c2.r;
    i = c1.i + c2.i;
    return new Complex(r, i);
  }

  public void show() {
    System.out.println(r + " + i" + i);
  }
}
