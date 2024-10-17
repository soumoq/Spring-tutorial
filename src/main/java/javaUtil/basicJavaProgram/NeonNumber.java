package javaUtil.basicJavaProgram;

public class NeonNumber {
  public static void main(String[] args) {
    int list = 100000;
    for (int i = 0; i <= list; i++) {
      if (isNeon(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isNeon(int in) {
    int mul = in * in;
    int res = 0;
    while (mul > 0) {
      int mul1 = mul % 10;
      res = res + mul1;
      mul = mul / 10;
    }
    return res == in;
  }
}
