package InputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1924 {
  public static void main(String[] args) throws IOException {
    String[] dayName = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    ArrayList<Integer> day28 = new ArrayList<>(Arrays.asList(2));
    ArrayList<Integer> day30 = new ArrayList<>(Arrays.asList(4, 6, 9, 11));
    ArrayList<Integer> day31 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 8, 10, 12));

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int m = Integer.parseInt(st.nextToken());
    int d = Integer.parseInt(st.nextToken());

    int day = 0;
    int j = 1;
    while(j<m) {
      if (day28.contains(j)) {
        day += 28;
      } else if (day30.contains(j)) {
        day += 30;
      } else if (day31.contains(j)) {
        day += 31;
      }
      j++;
    }
    day += d;

    int dayIndex = (day)%7;
    String result = dayName[dayIndex];
    System.out.print(result);
  }
}