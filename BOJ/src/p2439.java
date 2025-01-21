import java.io.*;

public class p2439 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int i, j, k;
    for (i=0; i<n; i++) {
      for (k=0; k<n-i-1; k++) {
        bw.write(" ");
      }
      for (j=0; j<=i; j++) {
        bw.write("*");
      }
      bw.newLine();
    }
    bw.flush();
    bw.close();
  }
}