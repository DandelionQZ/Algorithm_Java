import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11720 {
  public static void main(String[] args) throws IOException {
    int i, n, m;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str;

    n = Integer.parseInt(br.readLine());
    str = br.readLine();
    m = 0;
    for (i=0; i<n; i++) {
      m += str.charAt(i)-'0';
    }
    System.out.println(m);
  }
}
