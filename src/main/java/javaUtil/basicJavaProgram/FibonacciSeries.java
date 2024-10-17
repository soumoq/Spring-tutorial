package javaUtil.basicJavaProgram;

import java.math.BigInteger;

public class FibonacciSeries {
  public static void main(String[] args) {
    int in = 999999999;
    BigInteger a = BigInteger.ZERO;
    BigInteger b = BigInteger.ONE;
    BigInteger sum = BigInteger.ZERO;
    for (int i = 0; i <= in; i++) {
      BigInteger next = a.add(b);
//      if (next.compareTo(BigInteger.valueOf(in)) < 0){
        b = a;
        a = next;
        sum = sum.add(next);
        System.out.println(next);
//      }
    }
    System.out.println(sum);
  }
}
