package InputOutput;

import java.util.Scanner;

public class p10952 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    while(sc.hasNext()) {
      a = sc.nextInt();
      b = sc.nextInt();
      sc.nextLine();
      if(a==0&&b==0) break;
      System.out.println(a+b);
    }
    sc.close();
  }
}
