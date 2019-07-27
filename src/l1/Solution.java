package l1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    /*
    solution to use hashmap: T: O(n), S:O(n)
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashStore = new HashMap<Integer, Integer>();
        for (int i = 0; i< nums.length; i++) {
            int peerNum = target - nums[i];
            if(hashStore.containsKey(peerNum)) {
                return new int[]{hashStore.get(peerNum), i};
            }
            hashStore.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
