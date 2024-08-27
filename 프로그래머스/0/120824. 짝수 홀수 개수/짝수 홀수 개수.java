import java.util.stream.*;
import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int a = 0;
        int b = 0;
        a = (int) Arrays.stream(num_list).filter(i -> i % 2 == 0).count();
        int[] answer = {a, num_list.length - a};
        return answer;
    }
}