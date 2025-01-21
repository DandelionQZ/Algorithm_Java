import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11721 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder st = new StringBuilder();
    String str = br.readLine();

    int j = -1;
    for (int i=0; i<str.length(); i++) {
      if (j%10 == 9) st.append("\n");
      st.append(str.charAt(i));
      j++;
    }
    System.out.print(st);
  }
}
