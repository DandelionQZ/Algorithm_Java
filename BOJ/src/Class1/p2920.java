package Class1;

import java.util.Scanner;

public class p2920 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    switch (a) {
      case "1 2 3 4 5 6 7 8":
        System.out.print("ascending");
        break;
      case "8 7 6 5 4 3 2 1":
        System.out.print("descending");
        break;
      default:
        System.out.print("mixed");
        break;
    }
  }
}
