package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class p2588 {
  public static void main(String[] args) throws IOException {
    int[] first = new int[3];
    int[] second = new int[3];
    int [] result = new int[4];
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    for(int i=0; i<3; i++) {
      first[i] = Integer.parseInt(String.valueOf(str1.charAt(i)));
    }
    String str2 = sc.nextLine();
    for(int j=0; j<3; j++) {
      second[j] = Integer.parseInt(String.valueOf(str2.charAt(j)));
    }
    int total = 0;
    for(int m=2; m>-1; m--) {
      for(int n=2; n>-1; n--) {
        total += (int) (second[m]*Math.pow(10, 2-m)*first[n]*Math.pow(10, 2-n));
      }
      result[2-m] = total;
      total = 0;
    }
    System.out.println(result[0]);
    System.out.println(result[1]/10);
    System.out.println(result[2]/100);
    result[3] = result[0]+result[1]+result[2];
    System.out.println(result[3]);
  }
}
