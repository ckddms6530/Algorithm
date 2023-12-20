import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hs = new HashMap<>();
        HashMap<String, Integer> hs2 = new HashMap<>();
        for(int i = 0 ; i < participant.length ; i++ ){
            if(hs.get(participant[i]) != null ) {
                hs.put(participant[i]  , hs.get(participant[i]) +1);
            }else{
                hs.put(participant[i] , 1);
            }
        }
        for(int i = 0; i < completion.length ; i++){
            if(hs.get(completion[i]) != null ) {
                hs.put(completion[i]  , hs.get(completion[i]) -1 );
        }
        }
        
        for(int i = 0 ; i < participant.length ; i++){
            if(hs.get(participant[i]) == 1){
                answer = participant[i];
                 }
              
            
                
        }
        
          return answer;
           
        
        
    }
}
