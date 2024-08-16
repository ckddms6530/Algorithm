class Solution {
    public String solution(String s) {
        String[] sArr = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        
        boolean prevBlank = true;
        for(String str : sArr){
            if(str.isBlank()){
                sb.append(str);
                prevBlank = true;
                continue;
            }
            if(prevBlank){
                sb.append(str.toUpperCase());
                prevBlank = false;
            }else{
                sb.append(str.toLowerCase());
            }
            
        }
        
        return sb.toString();
    }
}