package javaUtil.basicJavaProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class EvenOddBigNumber {
  public static void main(String[] args) {
    if (new Scanner(System.in).nextBigInteger().mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO))
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
}
