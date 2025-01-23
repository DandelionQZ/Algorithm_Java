package Class1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class p10871 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringTokenizer st = new StringTokenizer(sc.nextLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());

    Scanner sc2 = new Scanner(System.in);
    StringTokenizer st2 = new StringTokenizer(sc.nextLine());
    int c;
    for (int i=0; i<a; i++) {
      c = Integer.parseInt(st2.nextToken());
      if (c < b) System.out.print(c + " ");
    }
  }
}
