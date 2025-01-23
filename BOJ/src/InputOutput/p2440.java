package InputOutput;

import java.io.*;

public class p2440 {
  private static final String star = "*";
  private static final String mpt = " ";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i=n; i>0; i--) {
      bw.write(star.repeat(i));
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}