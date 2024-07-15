/**
 * Pq1_FindTheDuplicateNumber
 */
public class Pq1_FindTheDuplicateNumber {

    public static void sortColors(int[] nums) {
        int n = nums.length;
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                cnt0++;
            } else if (nums[i] == 1) {
                cnt1++;
            } else {
                cnt2++;
            }
        }
        int index = 0;
        for (int i = 0; i < cnt0; i++) {
            nums[index++] = 0;
        }
        for (int i = cnt0; i < cnt0 + cnt1; i++) {
            nums[index++] = 1;
        }
        for (int i = cnt0 + cnt1; i < n; i++) {
            nums[index++] = 2;
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,0,2,2,0,1};
        sortColors(nums);
    }

}