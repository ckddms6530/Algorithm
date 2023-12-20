import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        for(int i = 0 ; i < queries.length ; i++){
            String tmp = my_string.substring(queries[i][0], queries[i][1]+1);
            String reverse = new StringBuilder().append(tmp).reverse().toString();
            my_string = my_string.substring(0 , queries[i][0]) + reverse + my_string.substring(queries[i][1]+1);
        }
        return my_string;
    }
}