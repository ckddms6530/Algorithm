import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        Queue<Integer> stack = new LinkedList<>();
        
				
		for(int i = 0 ; i < arr.length ; i++ ){
            if(i == 0){
                stack.add(arr[i]);
                continue;
            }
     
                
            if(arr[i-1] != arr[i]){
                stack.add(arr[i]);
            }        


        }
        int[] answer = new int[stack.size()];
        int i = 0;
        while(!stack.isEmpty()){
            answer[i] = stack.poll();
            i++;
            }
        return answer;
    }
}