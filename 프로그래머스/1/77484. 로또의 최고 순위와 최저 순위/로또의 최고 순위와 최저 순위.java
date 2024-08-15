class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int matchCount = 0;
        int zeroCount = 0;
        for(int lotto : lottos){
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            for(int win : win_nums){
                if(lotto == win){
                    matchCount++;
                    continue;
                }
            }
        }
        System.out.println(matchCount);
        System.out.println(zeroCount);
        int max = 7 - (matchCount + zeroCount);
        int min = 7 - (matchCount);
        if(max == 7) {
            max=6;
        }
        if(min == 7){
            min = 6;
        }
        return new int[]{max, min};
    }
}