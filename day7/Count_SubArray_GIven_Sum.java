package day7;

public class Count_SubArray_GIven_Sum {

    public static void main(String[] args) {

        int nums[] = {1, 2, 3};   // sample input
        int k = 3;

        int result = subarraySum(nums, k);
        System.out.println(result);
    }

    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
