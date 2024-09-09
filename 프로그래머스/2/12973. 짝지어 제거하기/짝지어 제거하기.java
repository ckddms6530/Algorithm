import java.util.*;
class Solution
{
    public int solution(String s)
    {
        char[] arr = s.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        for(char c : arr){
            if(!stack.isEmpty()){
                if(stack.peek() == c){
                    stack.pop();
                    continue;
                }
                
            }
                stack.push(c);
            

        }

        return stack.size() > 0 ? 0 : 1;
    }
}