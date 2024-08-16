import java.util.*;
class Solution {
    
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int answer = 0;
    long maxSco = Long.valueOf(Integer.MAX_VALUE);
    public int solution(int[] scoville, int K) {
        
        if(K == 0){
            return -1;
        }
        int kcount = 0;
        for(int sco : scoville){
            if(sco <= K){
                kcount++;
            }
            queue.add(sco);
        }      
        if(kcount == 0){
            return 0;
        }

        while(queue.peek() < K){
            
            if(queue.size() < 2){
                return -1;
            }
            
            int v1 = queue.poll();
            
          
            
            int v2 = queue.poll();
            if(check(v2)){
                return -1;
            }
            queue.add(calcSco(v1, v2));
        }
        
        
        return answer;
    }
    
    
    public boolean check(int v2) {
        return v2 == 0;
    }
    
    public int calcSco(int v1, int v2){   
        answer++;
        long result = v1 + (v2 * 2);
        if(result > maxSco){
            return (int)maxSco;
        }
        return (int)result;
    }
    
}