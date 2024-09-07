import java.util.*;

public class Minimum {
  public static void main(String args[]) {
    int a[] = new int[] { 10, 20, 50, 70, 30 };
    int min = a[0];
    System.out.println("minimum array element is" + min);
    for (int i = 0; i < a.length; i++) {
      if (a[i] < min) {
        System.out.println(a[i] + "");
      }
    }
  }

}
