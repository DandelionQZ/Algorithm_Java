import java.io.*;

public class p2742_2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    while (n>0) {
      bw.write(n+"\n");
      n--;
    }
    bw.flush();
    bw.close();
  }
}
