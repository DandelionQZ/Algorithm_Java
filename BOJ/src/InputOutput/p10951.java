package InputOutput;

import java.util.Scanner;

public class p10951 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      sc.nextLine();
      System.out.println(a+b);
    }
    sc.close();
  }
}
