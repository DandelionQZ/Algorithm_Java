package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10953_2 {
  public static void main(String[] args) throws IOException {
    // InputStream, BufferedReader, StringTokenizer 사용
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String str;

    int n = Integer.parseInt(br.readLine());

    for (int i=0; i<n; i++) {
      str = br.readLine();
      st = new StringTokenizer(str, ",");
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());

      System.out.println(a+b);
    }
  }
}
