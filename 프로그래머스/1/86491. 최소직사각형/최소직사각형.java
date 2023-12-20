class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for(int i = 0 ; i < sizes.length ; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = 0;
                tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }   
        }
        
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < sizes.length ; i++){
            max = Math.max(max , sizes[i][0]);
            max2 = Math.max(max2 , sizes[i][1]);
        }
        answer = max * max2;
        return answer;
    }
}