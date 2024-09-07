class Evenodd {
  public static void main(String[] args) {
    int a[] = new int[] { 10, 20, 37, 53, 50 };
    System.out.println("Oddd elements are:");

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 != 0) {
        System.out.println(a[i] + "");
      }
    }
    System.out.println("Even elements are:");

    for (int i = 0; i < a.length; i++) {
      if (a[i] % 2 == 0) {
        System.out.println(a[i] + "");
      }

    }
  }
}
