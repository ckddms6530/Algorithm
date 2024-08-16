import java.util.*;
import java.util.stream.*;

class Solution {
            private static final String REMOVE_MAX = "D 1";
        private static final String REMOVE_MIN = "D -1";
        private static final String ADD_PREFIX = "I";
    SortedMap<Integer, Integer> map = new TreeMap<>();
    int[] answer = new int[2];
    public int[] solution(String[] operations) {

        
        for(String op : operations){
            parseOp(op);
        }
        if(map.isEmpty()){
            return answer;
        }
        answer[0] = map.lastKey();
        answer[1] = map.firstKey();

        return answer;
    }
    
    public void parseOp(String op){
        
        if(op.startsWith(ADD_PREFIX) ){
            
            int val = Integer.valueOf(op.split(" ")[1]);
            map.merge(val, 1 , Integer::sum);
            return;
        }
        
         int key = Integer.MIN_VALUE;

         if(map.isEmpty()){
                return;
         };
        
        if(op.equals(REMOVE_MAX)){
            key = map.lastKey();
        }else if (op.equals(REMOVE_MIN)) {
            key = map.firstKey();
        }
            
        int count = map.get(key);
        count--;
        if(count <= 0 ){
             map.remove(key);         
            }else{
             map.put(key, map.get(key)-1);
        }
        

    }
}