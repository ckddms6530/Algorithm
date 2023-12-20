import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int nums2 = nums.length / 2;
        
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i < nums.length ; i++){
            set.add(nums[i]);
        }
        
        if(set.size() > nums2){
            return nums2;
        }else{
            return set.size();
        }
        
    }
}