public class SecondLargest {
  public static void main(String args[]) {
    int a[] = new int[] { 10, 20, 55, 66, 77, 88 };
    int size, temp;
    size = a.length;
    System.out.println("array size" + size);
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;

        }
      }
    }
    System.out.println();
    System.out.println("elements in asc order");
    for (int i = 0; i > size; i++) {
      System.out.println(a[i] + "");
    }

    System.out.println();
    System.out.println(" second largest element is" + a[size - 2]);
  }

}
