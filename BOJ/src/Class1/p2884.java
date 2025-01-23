package Class1;

import java.util.Scanner;

public class p2884 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int m = sc.nextInt();
    sc.nextLine();
    if (h == 0) h = 24;
    int t = h*60+m - 45;
    int newH = t/60;
    if (newH == 24) newH = 0;
    int newM = t%60;
    System.out.printf("%d %d", newH, newM);
  }
}
