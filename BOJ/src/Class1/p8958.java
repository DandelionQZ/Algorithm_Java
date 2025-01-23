package Class1;

import java.util.Scanner;

public class p8958 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = Integer.parseInt(sc.nextLine());
    String q;
    int s, sum;
    for (int j=0; j<i; j++) {
      s = 1;
      sum = 0;
      q = sc.nextLine();
      for (int k=0; k<q.length(); k++) {
        if (q.charAt(k)=='O') {
          sum += s++;
        } else {
          s = 1;
        }
      }
      System.out.println(sum);
    }
  }
}
