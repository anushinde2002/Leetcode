import java.util.*;

public class Maximum {
  public static void main(String[] args) {
    int a[] = new int[] { 10, 30, 40, 50, 70 };
    int max = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("max element in array" + max);
  }
}
