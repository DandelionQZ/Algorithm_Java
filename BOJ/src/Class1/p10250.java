package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10250 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int i, j;
    i = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int h, w, n, F, R;
    for (j=0; j<i; j++) {
      st = new StringTokenizer(br.readLine());
      h = Integer.parseInt(st.nextToken());
      w = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      if (n%h == 0) {
        F = h;
      } else {
        F = n%h;
      }
      if (n%h == 0) {
        R = n/h;
      } else {
        R = n/h + 1;
      }
      System.out.printf("%d%02d \n", F, R);
    }
  }
}
