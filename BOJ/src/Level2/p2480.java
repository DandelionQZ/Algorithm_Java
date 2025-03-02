package Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2480 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());
    int p = 0;
    if (a == b && b == c) {
      p = (10 + a)*1000;
    } else if (a == b) {
      p = (10 + a)*100;
    } else if (b == c) {
      p = (10 + b)*100;
    } else if (c == a) {
      p = (10 + c)*100;
    } else if (a > b && a > c) {
      p = a*100;
    } else if (b > a && b > c) {
      p = b*100;
    } else if (c > a && c > b) {
      p = c*100;
    }
    System.out.print(p);
  }
}
