package HW1;

import java.util.Scanner;

public class task2{

  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Количество элементов в массиве: ");
    int n = iScanner.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = iScanner.nextInt();
    }
    System.out.printf("На что надо умножить: ");
    int x = iScanner.nextInt();
    for (int i = 0; i < n; i++) {
      arr[i] *= x;
    }
    for (int i = 0; i < n; i++) {
      System.out.println(arr[i]);
    }
  }
}
