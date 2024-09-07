public class SecondSmallest {

  public static void main(String[] args) {
    int a[] = new int[] { 11, 22, 33, 44, 55 };
    int temp, size;
    size = a.length;
    System.out.println("array of size is" + size);
    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] < a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }

    }
    System.out.println();
    System.out.println("Elements of array in asc");
    for (int i = 0; i < size; i++) {
      System.out.println(a[i] + " ");
    }

    System.out.println();
    System.out.println("Second smallest element is" + a[size - 2]);

  }
}
