package Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p25304 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int ttl = Integer.parseInt(br.readLine());
    int r = Integer.parseInt(br.readLine());
    int temp = 0;
    int p, n;
    StringTokenizer st;
    for (int i = 0; i<r; i++) {
      st = new StringTokenizer(br.readLine());
      p = Integer.parseInt(st.nextToken());
      n = Integer.parseInt(st.nextToken());
      temp += p*n;
    }
    if (ttl == temp) {
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}
