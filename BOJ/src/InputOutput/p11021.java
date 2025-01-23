package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11021 {
  public static void main(String[] args) throws IOException {
    int x, n, a, b;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String str;

    x = 1;
    n = Integer.parseInt(br.readLine());

    for (int i=0; i<n; i++) {
      str = br.readLine();
      st = new StringTokenizer(str);
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      System.out.printf("Case #%d: %d\n", x++, a+b);
    }
  }
}
