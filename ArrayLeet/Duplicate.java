public class Duplicate {
  public static void main(String args[]) {
    int a[] = new int[] { 10, 20, 30, 40, 40, 50, 50, 70 };
    System.out.println("duplicate elments are");
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          System.out.println(a[j]);
        }
      }
    }

  }
}
