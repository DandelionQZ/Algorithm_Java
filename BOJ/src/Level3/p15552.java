package Level3;

import java.io.*;
import java.util.StringTokenizer;

public class p15552 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int a, b, c;
    int N = Integer.parseInt(br.readLine());
    for (int n = 0; n<N; n++) {
      st = new StringTokenizer(br.readLine());
      a = Integer.parseInt(st.nextToken());
      b = Integer.parseInt(st.nextToken());
      c = a+b;
      bw.write(c + "\n");
    }
    bw.flush();
    bw.close();
  }
}
