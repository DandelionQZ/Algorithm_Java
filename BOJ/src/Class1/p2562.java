package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2562 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] arr = new int[9];
    for (int i=0; i<9; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }
    int maxNum = 0;
    int maxIdx = 1;
    for (int j=0; j<9; j++) {
      if (arr[j]>maxNum) {
        maxNum = arr[j];
        maxIdx = j+1;
      }
    }
    System.out.printf("%d\n%d", maxNum, maxIdx);
  }
}
