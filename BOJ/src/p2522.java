import java.io.*;

public class p2522 {
  private static final String star = "*";
  private static final String mpt = " ";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i=0; i<2*n-1; i++) {
      bw.write(mpt.repeat(n-i-1+2*(i/n)*(i-n+1)) + star.repeat(i+1-2*(i/n)*(i-n+1)));
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
