import java.util.*;
import java.util.stream.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        int length = genres.length;
        
        // 장르 별로 가장 많이 재생된 노래를 두 개씩
        HashMap<String, List<Album>> mostPlayMap = new HashMap<>();
        
        for(int i = 0; i < length; i++){
            Album a = new Album(i, genres[i], plays[i]);
            String genre = genres[i];
            
            if(mostPlayMap.containsKey(genre)){
                mostPlayMap.get(genre).add(a);
            }else{
                mostPlayMap.put(genre, new ArrayList<>());
                mostPlayMap.get(genre).add(a);
            }
        }
         List<Answer> aList = new ArrayList<>();
        for (List<Album> list: mostPlayMap.values()) {
            Collections.sort(list);
            Answer answer = new Answer();
            answer.genre = list.get(0).genre;
            answer.plays = list.stream().mapToInt(a -> a.plays).sum() ;
            aList.add(answer);
        }
       

        List<String> keys = aList
            .stream()
            .sorted((a, a2) -> Integer.compare(a2.plays , a.plays))
            .map(a -> a.genre)
            .collect(Collectors.toList());
        
        
        Set<String> genreSet = new HashSet<>(Arrays.asList(genres));
        List<Integer> idList = new ArrayList<>();
        for(String key : keys){
            int count = 0;
            for(Album a : mostPlayMap.get(key)){
                if(count == 2){
                    break;
                }
                idList.add(a.id);
                count++;    

            }
            
        }

        return idList.stream().mapToInt(v -> v).toArray();
    }
}
class Album implements Comparable<Album>{
    int id;
    String genre;
    int plays;
    
    public Album(int id, String genre, int plays){
        this.id = id;
        this.genre = genre;
        this.plays = plays;
    }
    
    public int compareTo(Album other){
        int result = other.plays - this.plays;
        if(result == 0){
            result = this.id - other.id;
        }
        return result;
    }

}
    
    class Answer{
        String genre;
        int plays;
        
    }