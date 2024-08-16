class Solution {
    int plusIdx = 0;
    int minusIdx = 1;
    int answer = 0;
    int[][] 그래프;
    int limit;
    
    public int solution(int[] numbers, int target) {
        

        // 음수, 양수 노드를 생성 int[][0] 양수 int[][1] 음수

        그래프 = new int[numbers.length][2];
        
        int idx = 0;
        limit = numbers.length;
        
        for(int num : numbers){
            그래프[idx][plusIdx] = num;
            그래프[idx][minusIdx] = -num;
            idx++;
        }
        
        dfs(0, 0, target);

        return answer;
    }
    
    
    public void dfs(int idx, int val,int target){
         // 처음에는 그냥 0번쨰의 노드 꺼내온다 ;
         if (idx == limit) {
            if(val == target) {
                answer++;
            }
            return;
        }
        int[] 노드배열 = 그래프[idx];
        
        int 양수 = 노드배열[plusIdx];
        int 음수 = 노드배열[minusIdx];
        
        양수 += val;
        음수 += val;

        int targetIdx = idx+1;

        dfs(targetIdx, 양수, target);

        
        dfs(targetIdx, 음수, target);
    }
}

/*
0 ] (1, 1) (-1, 1)
1 ] 1 -1
2 ] 1 -1
3 ] 1 -1
4 ] 1 -1
*/
