import java.io.*;

public class p2442 {
  private static final String star = "*";
  private static final String mpt = " ";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i=0; i<n; i++) {
      bw.write(mpt.repeat(n-i-1)+star.repeat(2*(i+1)-1));
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}