class Solution
{
    public int solution(int n, int a, int b)
    {
        int answer = 1;
        a = (a + 1) / 2;
        b = (b + 1) / 2;
        while(a != b){
        answer++;
        a = (a + 1) / 2;
        b = (b + 1) / 2;
        }
        return answer;
    }
}