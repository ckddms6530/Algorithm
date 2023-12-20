class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        for(int i = 0 ; i < code.length() ; i++){
            
            if(code.charAt(i) == '1'){
                mode =  !mode;
                continue;
            }
            
            if(mode == true){
                if(i%2==0){
                    answer += code.charAt(i);
                }
            
            }else{
                if(i%2!=0){
                    answer += code.charAt(i);
                
            }
            
            
        }
        
    }
        if(answer == ""){
            return "EMPTY";
        }else{
        return answer;
            }
}
}