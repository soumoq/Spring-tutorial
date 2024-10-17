package javaUtil.basicJavaProgram;

public class LargestNumberAmong3 {
  public static void main(String[] args) {
    int a = 222;
    int b = 110222;
    int c = 3022;
    System.out.println(findBig(a, b, c));
  }

  static int findBig(int a, int b, int c) {
    if (a > b && a > c) {
      return a;
    } else if (b > a && b > c) {
      return b;
    } else
      return c;
  }
}
