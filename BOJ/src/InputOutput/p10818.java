package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10818 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] data = new int[n];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i=0; i<n; i++) {
      data[i] = Integer.parseInt(st.nextToken());
    }

    int minI = 0;
    int maxI = 0;

    for (int j=0; j<data.length; j++) {
      if (data[maxI] < data[j]) {
        maxI = j;
      } else if (data[minI] > data[j]) {
        minI = j;
      }
    }

    System.out.printf("%d %d", data[minI], data[maxI]);
  }
}
