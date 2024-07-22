/**
 * Pq1_SetMatrixZeros
 */
public class Pq1_SetMatrixZeros {

    public  static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate element is:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}