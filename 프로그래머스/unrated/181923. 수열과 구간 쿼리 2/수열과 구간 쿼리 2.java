import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for( int i = 0 ;  i < queries.length ; i++ ){
            
            int[] query = queries[i];
            int s = query[0], e = query[1], k = query[2];
  
            List<Integer> indexList = new ArrayList();
            for(int j = s ; j <= e ; j++){
                int arrI = arr[j];
                
                if(arrI > k) {
                    indexList.add(arrI);
                }
                
            }
            if(indexList.size() == 0){
                indexList.add(-1);
            }
            int result = Collections.min(indexList);
            answer[i] = result;  
        }
        
        
        return answer;
    }   
}