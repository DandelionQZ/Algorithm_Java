package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2577 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b, c, i;
    a = Integer.parseInt(br.readLine());
    b = Integer.parseInt(br.readLine());
    c = Integer.parseInt(br.readLine());
    String d = String.valueOf(a*b*c);
    int[] arr = new int[10];
    for (i=0; i<d.length(); i++) {
      int k = d.charAt(i) - '0';
      arr[k]++;
    }
    for (i=0; i<10; i++) {
      System.out.println(arr[i]);
    }
  }
}
