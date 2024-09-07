import java.util.*;
import java.util.Arrays;

public class Bubblesort {
  public static void main(String[] args) {
    int a[] = new int[] { 10, 30, 90, 70, 29 };
    int temp = 0;
    System.out.println("arrays elements before sorting" + Arrays.toString(a));
    int n = a.length;
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length - 1; j++) {
        if (a[j] > a[j + 1]) {
          temp = a[i];
          a[i] = a[j + 1];
          a[j + 1] = temp;
        }
      }
    }
    System.out.println("array after sorting" + Arrays.toString(a));

  }
}