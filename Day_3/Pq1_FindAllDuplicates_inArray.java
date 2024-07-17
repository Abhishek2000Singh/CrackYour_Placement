import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Pq1_findTheDuplicate
 */
public class Pq1_FindAllDuplicates_inArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int[] count = new int[nums.length + 1];
        for (int freq : nums)
            count[freq]++;

        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}