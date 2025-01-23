package InputOutput;

import java.io.*;

public class p2438 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    for (int i=0; i<n; i++) {
      for (int j=0; j<=i; j++) {
        bw.write("*");
      }
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }
}
