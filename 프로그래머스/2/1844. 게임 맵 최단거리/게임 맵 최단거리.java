class Solution {
    public int solution(int[][] maps) {
        int 가로길이 =  maps[0].length;
        int 세로길이 =  maps.length;
        if (excepted(maps, 가로길이, 세로길이) ) {
            return -1;
        }
        System.out.println("가로 : "+가로길이);
        System.out.println("세로 : "+세로길이);
        
        int answer = 0;
        return answer;
    }
    
    public boolean excepted (int[][] maps, int 가로길이, int 세로길이) {
          int 위칸 = maps[세로길이-1][가로길이-2];
          int 아래칸 = maps[세로길이-2][가로길이-1];
        return 0 == 위칸 + 아래칸;
    }
}