// Solution #1
import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num: nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            } else{
                map.put(num,1);
            }
            
            if(map.get(num)>nums.length/2){
                return num;
            }
        }
        return 0;        
    }
}

// Solution #2
class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 0;

        for(int num: nums){
            if(count == 0){
                res = num;
            }
            count += res == num ? 1: -1;
        }
        return res;
    }
}