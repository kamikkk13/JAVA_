package SEM1;


public class task1 {
    public static void main(String[] args) {
        int h = 10, a = 3, b = 2, res = 0, days = 0;
        
        while (true) {
            days ++;
            res += a;
            if (res >= h)
                break;
            res -= b;
        }

        System.out.println(days);
         }
        



}
