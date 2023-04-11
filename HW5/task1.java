package HW5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class task1{
    
       
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        addNumber("Magomedova", 143, bookPhone);
        addNumber("Magomedova", 1233, bookPhone);
        addNumber("Isaev", 554333, bookPhone);
        addNumber("Aliev", 8930438, bookPhone);
        addNumber("Magomedova", 9453333, bookPhone);
        addNumber("Isaev", 7433333, bookPhone);
        printBook(bookPhone);
       }
}