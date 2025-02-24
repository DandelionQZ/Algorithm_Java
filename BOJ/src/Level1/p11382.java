package Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11382 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    long a, b, c;
    a = Long.parseLong(st.nextToken());
    b = Long.parseLong(st.nextToken());
    c = Long.parseLong(st.nextToken());
    System.out.print(a+b+c);
  }
}
