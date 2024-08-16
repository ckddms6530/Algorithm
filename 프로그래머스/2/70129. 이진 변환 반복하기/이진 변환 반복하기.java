import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        List<Integer> list = new ArrayList<>();
        
        if(s.length() == 1){
            return new int[]{0, 0};
        }
        int count = 0;
        int zeroCount = 0;
        while(true){
           int prev = s.length();

           s = s.replaceAll("0","");

           int len = s.length();

           zeroCount += (prev - len);

           s = Integer.toBinaryString(len);
           count++;
           if(s.length() == 1){
                break;        
           }
        }

        return new int[]{count, zeroCount};
    }
}