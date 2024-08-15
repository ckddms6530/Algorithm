import java.util.*;
import java.util.stream.*;
class Solution {
    int 날짜 = 0;
    Map<Integer, Integer> 배포카운트 = new HashMap<>();
    public int[] solution(int[] progresses, int[] speeds) {
        
        PriorityQueue<Solution.Feature> pQ = new PriorityQueue<>();
        
        for(int i = 0; i < speeds.length ; i++) {
            int 진행도 = progresses[i];
            int 작업속도 = speeds[i];
            pQ.add(new Feature(진행도, 작업속도, i));
        }
        while(!pQ.isEmpty()){
            
            if(pQ.peek().진행도 >= 100){
                Feature f = pQ.poll();  

                
                if(배포카운트.get(날짜) == null){
                    배포카운트.put(날짜, 1);

                }else{
                    배포카운트.put(날짜, 배포카운트.get(날짜)+1);

                }
                continue;
            }else {
                다음날(pQ);
            }
            
        }
        List<Integer> answer = new ArrayList<>();
        
        int idx = 0;
        
        List<Integer> keySet = new ArrayList<>( 배포카운트.keySet());
        
        Collections.sort(keySet);
        
        for(Integer key : keySet){
            answer.add(배포카운트.get(key));
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public void 다음날(PriorityQueue<Feature> pQ){
        날짜++;
        pQ.stream().forEach(Feature::progress);
    }
    
    static class Feature implements Comparable<Feature>{
        public int 진행도;
        public int 작업속도;
        public int 순서;
        
        public Feature(int 진행도, int 작업속도, int 순서) {
            this.순서 = 순서;
            this.진행도 = 진행도;
            this.작업속도 = 작업속도;
        }
        
        @Override
        public int compareTo(Feature feature){
            return this.순서 - feature.순서;
        }
        
        public void progress(){
            this.진행도 += 작업속도;
        }
        public String toString(){
            return "진행도 -> " + 진행도 + " 작업속도-> " + 작업속도+ " 순서 -> " + 순서;
        }
    }
}