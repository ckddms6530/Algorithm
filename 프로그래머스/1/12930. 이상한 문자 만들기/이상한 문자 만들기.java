import java.util.*;

class Solution {
    public String solution(String s) {
        
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s, " ", true);
  
        while(st.hasMoreTokens()){
            
          String token = st.nextToken();
          if(token.equals(" ")){
              sb.append(" ");
              continue;
          }
          for(int i = 0; i < token.length(); i++){
          
            char up = token.charAt(i);
              
            if(i % 2 == 0){
               up = Character.toUpperCase(up);
            }else{
                up = Character.toLowerCase(up);
            }
            sb.append(up);
          }
            
            
        }
        

        
        
        return sb.toString();
    }
}