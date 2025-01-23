package Class1;

import java.util.Scanner;

public class p9498 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.nextLine());
    if (a >= 90) {
      System.out.print("A");
    } else if (a >=80) {
      System.out.print("B");
    } else if (a >= 70) {
      System.out.print("C");
    } else if (a >= 60) {
      System.out.print("D");
    } else {
      System.out.print("F");
    }
  }
}
