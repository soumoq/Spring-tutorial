package javaUtil.basicJavaProgram;

public class Armstrong {
  public static void main(String[] args) {
    int list = 10000;
    for (int i = 1; i <= list; i++) {
      if (isAmstring(i)) {
        System.out.println(i);
      }
    }
  }

  public static boolean isAmstring(int in) {
    int sum = 0;
    int backup = in;
    int inLen = String.valueOf(in).length();
    while (in > 0) {
      int rem = in % 10;
      sum = sum + (int) Math.pow(rem, inLen);
      in = in / 10;
    }
    if (sum == backup)
      return true;
    else
      return false;
  }
}
