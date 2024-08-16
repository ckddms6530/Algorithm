import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        String[] skills = skill.split("");

        
        int idx = 0;
        for(String k : skills){

            for(int i = 0 ; i < skill_trees.length ; i++){
                skill_trees[i] = skill_trees[i].replaceAll(k, idx+"");
            }
            idx++;
        }
        for(int i = 0 ; i < skill_trees.length ; i++){
            skill_trees[i] = skill_trees[i].replaceAll("[A-Z]", "");
        }
        
        for(int i = 0 ; i < skill_trees.length ; i++){
            String[] checks = skill_trees[i].split("");
            if(checks[0].equals("")){
                answer++;
                continue;
            }
            if(!checks[0].equals("0")){
                continue;
            }
            int prev = -1;
            for(String c : checks){
                int lll = Integer.valueOf(c);
                if(lll == prev+1){
                    prev = lll;
                }else{
                    prev = -10;
                }
            }
            if(prev == -10){
                continue;
            }
            answer++;
        }
        
        return answer;
    }
}