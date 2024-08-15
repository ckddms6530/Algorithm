import java.util.*;
import java.util.stream.*;
class Solution {
    
    public int solution(int[] priorities, int location) {

        운영체제 os = new 운영체제(priorities);
        os.관리();
        
        return os.실행순서찾기(location);
    }
    
}

class 운영체제 {
    
    Queue<프로세스> 큐;
    List<프로세스> 실행순서;
    
    public 운영체제 (int[] 우선순위배열){
        
        큐 = new LinkedList<>();
        실행순서 = new LinkedList<>();
        
        for(int i = 0 ; i < 우선순위배열.length ; i++){
            큐.add(new 프로세스(우선순위배열[i], i));
        }
        
    }
    
    public int 실행순서찾기(int location){
        for(int i = 0 ; i < 실행순서.size() ;  i++){
            if(실행순서.get(i).초기위치 == location){
                return i+1;
            }
        }
        return -1;
    }
    
    public void 관리(){
        while(!큐.isEmpty()){
        프로세스 process = 큐.poll();
        int 검사순위 = process.우선순위;
            Optional<프로세스> option = 큐.stream().filter( p -> p.우선순위 > 검사순위).findFirst();
            if(option.isPresent()){
                큐.add(process);
            }else{
                실행순서.add(process);
            }
        }
    }
    static class 프로세스{
        public int 초기위치;
        public int 우선순위;
        
        public 프로세스(int 우선순위, int 초기위치){
            this.초기위치 = 초기위치;
            this.우선순위 = 우선순위;
        }
        
        public String toString(){
            return String.format("초기위치 %d 우선순위 %d", 초기위치, 우선순위);
        }
    }
    
}