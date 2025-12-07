package day7;

import java.util.Arrays;

public class MinimumPlatform_gfg {

    public static void main(String[] args) {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int result = minPlatform(arr, dep);
        System.out.println(result);
    }

    public static int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0;
        int j = 0;
        int n = arr.length;
        int count = 0, maxCount = 0;

        while (i < n) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            } else if (arr[i] > dep[j]) {
                count--;
                j++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
