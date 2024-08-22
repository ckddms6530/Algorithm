class Solution {
    boolean solution(String s) {
        char[] arr = s.toUpperCase().toCharArray();
        int p = 0;
        int y = 0;
        for(char c : arr){
            p += c == 'P' ? 1 : 0;
            y += c == 'Y' ? 1 : 0;
        }
        return p+y == 0 ? true : p - y == 0 ? true : false;
    }
}