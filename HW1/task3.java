package HW1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String aStr = iScanner.next();
        String symbol = iScanner.next();
        String bStr = iScanner.next();
        Integer a = Integer.valueOf(aStr);
        Integer b = Integer.valueOf(bStr);
        switch (symbol) {
          case "+":
            System.out.printf("= %d", a + b);
            break;
          case "-":
            System.out.printf("= %d", a - b);
    
            break;
          case "=":
            System.out.printf("result: %s", a == b ? "равны" : "не равны");
    
            break;
          case "*":
            System.out.printf("result: %d", a * b);
    
            break;
    
          default:
            System.out.println("fail!");
            break;
        }
      }


}
