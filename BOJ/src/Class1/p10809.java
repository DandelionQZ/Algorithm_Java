package Class1;

import java.util.Scanner;

public class p10809 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pr = sc.nextLine();
    String[] ap = new String[]{"a", "b", "c", "d", "e", "f",
    "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
    "s", "t", "u", "v", "w", "x", "y", "z"};
    for (int i=0; i<ap.length; i++) {
      System.out.print(pr.indexOf(ap[i]) + " ");
    }
  }
}
