package HW2;

public class task1 {
    public static String findJewelsInStones(String jewels, String stones) {
        char[] jewelsArr = jewels.toCharArray();
        char[] stonesArr = stones.toCharArray();
        String result = "";
        for (char jewel : jewelsArr) {
          int count = 0;
          for (char stone : stonesArr) {
            if (jewel == stone)
              count++;
          }
          result = result + jewel + count;
    
        }
        return result;
      }
    
      public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = findJewelsInStones(jewels, stones);
        System.out.println(result);


        
      }



}
