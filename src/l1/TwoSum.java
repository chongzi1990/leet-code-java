package l1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    solution to use hashmap: T: O(n), S:O(n)
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Boolean> hashStore = new HashMap<Integer, Boolean>();
        for (int num: nums) {
            int peerNum = target - num;
            if hashStore.containsKey(peerNum) {
                return new int[]{peerNum, num};
            }
            hashStore.put(num, true);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
