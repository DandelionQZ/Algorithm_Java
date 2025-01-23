package InputOutput;

import java.io.*;

public class p2739 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int m = 1;
    while (m < 10) {
      bw.write(n+" * "+m+" = "+(n*m)+"\n");
      m++;
    }
    bw.flush();
    bw.close();
  }
}
