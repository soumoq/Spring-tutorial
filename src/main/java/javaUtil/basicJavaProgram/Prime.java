package javaUtil.basicJavaProgram;

public class Prime {
  public static void main(String[] args) {
    int list = 10000;
    for (int i = 1; i <= list; i++) {
      if (i == 1)
        System.out.println(i);
      else if (i == 2)
        System.out.println(i);
      else if (isPrime(i))
        System.out.println(i);
    }

  }

  public static boolean isPrime(int p) {
    boolean check = true;
    for (int i = 2; i < p; i++) {
      if (p % i == 0) {
        check = false;
        break;
      }
    }
    return check;
  }
}
