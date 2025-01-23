package InputOutput;

import java.util.Scanner;

public class p10953 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();

    int i, a, b;
    for (i=0; i<n; i++) {
      String str = sc.nextLine();
      a = Integer.parseInt(String.valueOf(str.charAt(0)));
      b = Integer.parseInt(String.valueOf(str.charAt(2)));
      System.out.println(a+b);
    }
  }
}
