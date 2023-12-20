import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        
        HashMap<String , Integer > playerAndRank = new HashMap();
        HashMap<Integer, String> rankAndPlayer = new HashMap();
        
        int idx = 1;
        for(String player : players){

            playerAndRank.put(player , idx);
            rankAndPlayer.put(idx, player);
            idx++;
        }
        
        for(String call : callings){
            int playerRank = playerAndRank.get(call)-1 ;// 부른 선수의 앞 등수
            String prePlayer = rankAndPlayer.get(playerRank); // 부른 선수 앞 선수의 이름
            
            playerAndRank.put(call , playerRank);    //부른 선수의 등수를 앞 선수의 등수로;
            playerAndRank.put(prePlayer , playerRank+1 );  //앞 선수 등수를 +1
            
            rankAndPlayer.put( playerRank  , call ); //앞 등수의 이름을 불린 선수로 바꿈
            rankAndPlayer.put( playerRank+1  , prePlayer ); //앞 등수의 이름을 불린 선수로 바꿈
            
        }
        for(int i = 1 ;  i <= rankAndPlayer.size() ; i++){
            answer[i-1] = rankAndPlayer.get(i);
        }

    
        
        return answer;
    }
}