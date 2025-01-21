import java.util.Scanner;

public class p10950 {
  public static void main(String[] args) {
    int i, n, x, y;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.nextLine();

    int[] result = new int[n];
    for(i=0; i<n; i++) {
      String line = sc.nextLine();
      String[] arr = line.split(" ");
      x = Integer.parseInt(arr[0]);
      y = Integer.parseInt(arr[1]);
      result[i] = x+y;
    }

    for(i=0; i<result.length; i++) {
      System.out.println(result[i]);
    }
  }
}
