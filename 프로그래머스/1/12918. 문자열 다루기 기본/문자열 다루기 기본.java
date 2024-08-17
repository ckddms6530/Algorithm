class Solution {
    public boolean solution(String s) {
        int len = s.length();
        if( (len != 4) && (len != 6) ){
            return false;
        }
        String str = s.replaceAll("^[0-9]*$","");
    
        return str.length() > 0 ? false : true;
    }
}