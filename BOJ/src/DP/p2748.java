package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2748 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int f = Integer.parseInt(br.readLine());

    long a = 0;
    long b = 1;
    long temp = 1;
    for (int i=2; i<=f; i++) {
      temp = a + b;
      a = b;
      b = temp;
    }

    System.out.print(temp);
  }
}
