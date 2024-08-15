import java.util.*;
import java.util.stream.*;

class Solution {
        int hit = 1;
        int miss = 5;
        int time = 0;
    

    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * miss;
        }

        // 도시, 참조되지 않은 시간
        Map<String, Integer> 캐시 = new HashMap<>();
        for (int i = 0; i < cities.length; i++) {

            캐시.replaceAll((k, v) -> v + 1);
            String city = cities[i].toLowerCase();

            if (캐시.containsKey(city)) {
                캐시.put(city, 0);
                hit();
            } else {
                if (캐시.size() >= cacheSize) {
                    // 캐시에서 가장 오래된 항목을 찾아 제거
                    Map.Entry<String, Integer> maxEntry = 캐시.entrySet().stream().max(Map.Entry.comparingByValue()).get();
                    캐시.remove(maxEntry.getKey());
                }
                캐시.put(city, 0);
                miss();
            }
        }
        return time;
    }
    
    private void hit(){
        this.time += hit;
    }
    private void miss(){
        this.time += miss;
    };
}

