import java.util.stream.*;
import java.util.*;
class Solution {
    int answer = 1;
    public int solution(int[] num_list) {
        
        if(num_list.length >= 11){
            answer = Arrays.stream(num_list).sum();
        }else {
            
           for(int a : num_list){
               answer *= a;
           }
        }
        return answer;
    }
    
}