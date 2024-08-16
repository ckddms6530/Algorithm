import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        
            HashMap<String , Integer> map = new HashMap<>();
				
				for(int i = 0 ; i < clothes.length ; i++ ) {
					if(map.get(clothes[i][1]) != null) {
						map.put( clothes[i][1], map.get(clothes[i][1])+1);
					}else {
						map.put( clothes[i][1], 1);
					}
				}
				int result = 1;
				for(String clo : map.keySet()) {
					result = result *( map.get(clo)+1);
				}
				result--;
				
        return result;
    }
}