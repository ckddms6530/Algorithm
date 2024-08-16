import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int 제일가벼운사람위치 = 0;    
        int 제일무거운사람위치 = people.length-1;
        
        while(제일가벼운사람위치 <= 제일무거운사람위치){
            
            int 무게합 = people[제일가벼운사람위치] + people[제일무거운사람위치];
            if( 무게합 <= limit ){             
                제일가벼운사람위치++;
            }
            제일무거운사람위치--;
            answer++;
        }
    
        
        return answer;
    }
}