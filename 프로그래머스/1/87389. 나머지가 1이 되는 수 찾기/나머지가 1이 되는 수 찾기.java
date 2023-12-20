class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean stop = true;
        
        while(stop){
            if(n%answer == 1){
                stop = !stop;
                break;
            }
            answer += 1;
        }
        
        return answer;
    }
}