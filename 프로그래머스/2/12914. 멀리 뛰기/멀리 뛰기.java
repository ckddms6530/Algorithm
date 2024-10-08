class Solution {
    public long solution(int n) {
        
        long answer = 0;
        if(n < 2){ 
            return n;
        }
        long f[] = new long[n+1];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2 ; i <= n; i++){
            f[i] = (f[i-1] + f[i-2]) % 1234567;
        }
        return f[n];
    }
}