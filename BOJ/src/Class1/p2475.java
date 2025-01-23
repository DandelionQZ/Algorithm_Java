package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2475 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = (int) Math.pow(Double.parseDouble(st.nextToken()), 2);
    int b = (int) Math.pow(Double.parseDouble(st.nextToken()), 2);
    int c = (int) Math.pow(Double.parseDouble(st.nextToken()), 2);
    int d = (int) Math.pow(Double.parseDouble(st.nextToken()), 2);
    int e = (int) Math.pow(Double.parseDouble(st.nextToken()), 2);
    int f = (a+b+c+d+e)%10;
    System.out.print(f);
  }
}
