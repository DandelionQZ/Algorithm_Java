package Level4;

import java.io.*;
import java.util.StringTokenizer;

public class p10810 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N, M, i, j, k;
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    for (int m=0; m<M; m++) {
      st = new StringTokenizer(br.readLine());
      i = Integer.parseInt(st.nextToken());
      j = Integer.parseInt(st.nextToken());
      k = Integer.parseInt(st.nextToken());
      while (i <= j) {
        arr[i-1] = k;
        i++;
      }
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int r : arr) {
      bw.write(r + " ");
    }
    bw.flush();
    bw.close();
  }
}
