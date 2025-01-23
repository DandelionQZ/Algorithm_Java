package Class1;

import java.util.Scanner;

public class p31403 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.nextLine());
    int b = Integer.parseInt(sc.nextLine());
    int c = Integer.parseInt(sc.nextLine());
    System.out.println(a+b-c);
    System.out.print(Integer.parseInt(String.valueOf(a)+String.valueOf(b))-c);
  }
}
