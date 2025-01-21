import java.io.*;

public class p10991 {
  private static final String star = "*";
  private static final String mpt = " ";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int n = Integer.parseInt(br.readLine());

    for (int i=0; i<2*n-1; i+=2) {
      bw.write(mpt.repeat((2*n-i-1)/2));
      for (int j=0; j<=i; j++) {
        if (j%2 == 0) bw.write(star);
        if (j%2 == 1) bw.write(mpt);
      }
      bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
  }
}
