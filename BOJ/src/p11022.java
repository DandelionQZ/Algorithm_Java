import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11022 {
  public static void main(String[] args) throws IOException {
    int x, n, i, a, b;
    x = 1;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String str;

    n = Integer.parseInt(br.readLine());

    for (i=0; i<n; i++) {
      str = br.readLine();
      st = new StringTokenizer(str);
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      System.out.printf("Case #%d: %d + %d = %d\n", x++, a, b, a+b);
    }
  }
}
