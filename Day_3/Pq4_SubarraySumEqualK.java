import java.util.HashMap;

public class Pq4_SubarraySumEqualK {
    class Solution {
        public int subarraySum(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>(); // < sum,freq>
            map.put(0, 1); // empty subarray
            int ans = 0, sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += nums[j];

                if (map.containsKey(sum - k)) {
                    ans += map.get(sum - k);
                }

                if (map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
            return ans;
        }
    }
}
