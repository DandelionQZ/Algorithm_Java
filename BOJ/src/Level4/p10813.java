package Level4;

import java.io.*;
import java.util.StringTokenizer;

public class p10813 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N, M, i, j;
    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    int[] arr = new int[N];
    for (int n=0; n<N; n++) {
      arr[n] = n+1;
    }

    int temp;
    while (M>0) {
      st = new StringTokenizer(br.readLine());
      i = Integer.parseInt(st.nextToken());
      j = Integer.parseInt(st.nextToken());
      temp = arr[i-1];
      arr[i-1] = arr[j-1];
      arr[j-1] = temp;

      M--;
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    for (int r : arr) {
      bw.write(r + " ");
    }
    bw.flush();
    bw.close();
  }
}
