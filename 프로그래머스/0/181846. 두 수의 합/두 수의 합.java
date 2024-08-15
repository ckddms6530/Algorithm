import java.math.*;

class Solution {
    public String solution(String a, String b) {
      
        BigInteger bigInt1 = new BigInteger(a);
        BigInteger bigInt2 = new BigInteger(b);
        return bigInt1.add(bigInt2).toString();
    }
}