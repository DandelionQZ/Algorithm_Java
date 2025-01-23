package InputOutput;

import java.io.*;

public class p8393 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = 0;
    while (n >= 1) {
      m += n;
      n--;
    }
    System.out.print(m);
  }
}
