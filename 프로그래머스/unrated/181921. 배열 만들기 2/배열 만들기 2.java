import java.util.*;
    
class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        String numStr = "";
            
        for(int i = l ; i <= r ; i++){
             numStr = i + "";
             int count = 0;
            for(int j = 0 ; j < numStr.length() ; j++ ){
                if(numStr.charAt(j) == '0' || numStr.charAt(j) == '5'){
                    count++;
                }
            }
            if(count == numStr.length()){
                list.add(i);
            }
        }

        if(list.size() == 0){
            list.add(-1);
        }
        return list;
    }
}