package InputOutput;

import java.io.*;

public class p2445 {
  private static final String star = "*";
  private static final String mpt = " ";
  private static int getStar(int i, int n) {
    return i+1-2*(i/n)*(i-n+1);
  }
  private static int getMpt(int i, int n) {
    return (n-i-1+2*(i/n)*(i-n+1))*2;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    int s, m;
    for(int i=0; i<2*n; i++) {
      s = getStar(i, n);
      m = getMpt(i, n);
      bw.write(star.repeat(s) + mpt.repeat(m) + star.repeat(s));
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
