package Class1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p2675 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      StringTokenizer st = new StringTokenizer(sc.nextLine());
      int R = Integer.parseInt(st.nextToken());
      while (st.hasMoreTokens()) {
        String S = st.nextToken();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length(); i++) {
          sb.append(String.valueOf(S.charAt(i)).repeat(R));
        }
        System.out.println(sb);
      }
    }
  }
}