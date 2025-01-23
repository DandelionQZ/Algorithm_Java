package InputOutput;

import java.io.*;

public class p10992 {
  private static final String star = "*";
  private static final String mpt = " ";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i=0; i<n; i++) {
      if (i == n-1) break;
      bw.write(mpt.repeat(n-i-1));
      for (int j=0; j<2*i+1; j++) {
        if (j == 0 || j == 2*i) {
          bw.write(star);
        } else {
          bw.write(mpt);
        }
      }
      bw.newLine();
    }
    bw.write(star.repeat(2*n-1));
    bw.flush();
    bw.close();
    br.close();
  }
}
