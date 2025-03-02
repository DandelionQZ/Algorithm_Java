package Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p25314 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int B = Integer.parseInt(br.readLine());
    String str = "long ";
    System.out.print(str.repeat(B/4) + "int");
  }
}
