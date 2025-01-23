package Class1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class p3052 {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<10; i++) {
      arr.add(Integer.parseInt(sc.nextLine())%42);
    }

    HashSet<Integer> arrSet = new HashSet<>(arr);
    System.out.print(arrSet.size());
  }
}
