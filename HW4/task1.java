package HW4;
import java.util.*;
public class task1 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,5,4,3,4,5,6));
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "is palindrome" : "is not palindrome");


    }



    
}
