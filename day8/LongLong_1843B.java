package day8;

import java.util.Scanner;

public class LongLong_1843B {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        while (m-- > 0) {

            int n = sc.nextInt();
            long[] nums = new long[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextLong();
            }

            long sum = 0;
            int count = 0;

            for (int i = 0; i < n; i++) {

                if (nums[i] == 0 && i != 0) {
                    nums[i] = nums[i - 1];
                }

                if (nums[i] < 0 && (i == 0 || nums[i - 1] >= 0)) {
                    count++;
                }

                sum += Math.abs(nums[i]);
            }

            System.out.println(sum + " " + count);
        }

        sc.close();
    }
    
}
