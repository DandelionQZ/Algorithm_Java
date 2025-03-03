package Level4;

import java.io.*;
import java.util.StringTokenizer;

public class p10807 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i=0; i<N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    int F = Integer.parseInt(br.readLine());
    int c = 0;
    for (int j : arr) {
      if (j == F) {
        c++;
      }
    }
    System.out.print(c);
  }
}
