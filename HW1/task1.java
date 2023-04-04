package HW1;
import java.util.Scanner;

public class task1{
  public static void main(String[] args) {
    int[] arr = new int[1000];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i + 1;
    }
    int[] arr3 = new int[1000];
    for (int i = 0; i < arr.length; i++) {
      arr3[i] = (int) Math.pow(arr[i], 3);
    }
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Первое число: ");
    int x = iScanner.nextInt();
    System.out.printf("Второе число: ");
    int y = iScanner.nextInt();

    System.out.println(arr3[x - 1]);
    System.out.println(arr3[y - 1]);

  }
}
