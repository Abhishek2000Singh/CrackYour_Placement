import java.util.HashMap;
import java.util.Map;

public class P6_MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;

        for (int i : nums) {
            if (mpp.containsKey(i)) {
                mpp.put(i, mpp.getOrDefault(i, 0) + 1);
            } else {
                mpp.put(i, 1);
            }
        }
        for (int key : mpp.keySet()) {
            if (mpp.get(key) > n / 2) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
