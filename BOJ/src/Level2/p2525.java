package Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2525 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int H = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());
    int time = Integer.parseInt(br.readLine());
    H += (M+time)/60;
    H = H%24;
    M = (M+time)%60;
    System.out.print(H+" "+M);
  }
}
