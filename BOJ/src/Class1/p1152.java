package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p1152 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    ArrayList<String> arr = new ArrayList<>();
    while (st.hasMoreTokens()) {
      arr.add(st.nextToken());
    }
    System.out.print(arr.size());
  }
}
