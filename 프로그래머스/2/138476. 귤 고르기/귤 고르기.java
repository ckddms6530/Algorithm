import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        if(k==1){
            return 1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : tangerine){
            map.merge(num, 1, Integer::sum);
        }
        
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, (a, b) -> b-a);
        int a = 0;
        for(int n : list){
            answer++;
            a+=n;
            if(a >= k){
                break;
            }
        }
        return answer;
    }
}