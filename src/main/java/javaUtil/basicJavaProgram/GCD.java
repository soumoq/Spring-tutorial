package javaUtil.basicJavaProgram;

public class GCD {
  public static void main(String[] args) {
    System.out.println(Gcd(91, 47));
  }
  public static int Gcd(int x, int y){
    if (y == 0)
      return x;
    return Gcd(y, x % y);
  }
}
