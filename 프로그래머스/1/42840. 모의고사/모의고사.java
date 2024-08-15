import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; 
        int[] answer = {0,0,0};
        
        for(int i = 0 ; i < answers.length ; i++){
            
            if(student1[i%5] == answers[i]){
                answer[0]++;
            } 
            if(student2[i%8] == answers[i]){
                answer[1]++;
            }             
            if(student3[i%10] == answers[i]){
                answer[2]++;
            }             
            
        }
        int max = Integer.MIN_VALUE;
        
        for(int i  : answer){
            if(max < i) max = i;
        }
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < answer.length; i++){
            if(answer[i] == max){
                list.add(i+1);
            }
            
        }
        int[] result = new int[list.size()];
        
        for(int i =0 ; i<list.size() ; i++){
            result[i] = list.get(i);
        }
        Arrays.sort(result);
        return result;
    }
}