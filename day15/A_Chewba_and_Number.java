package day15;
import java.util.Scanner;

public class A_Chewba_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numStr = sc.next();   // take input as String
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';

            // first digit should not become 0
            if (i == 0 && digit == 9) {
                ans.append(digit);
            } else if (digit >= 5) {
                ans.append(9 - digit);
            } else {
                ans.append(digit);
            }
        }

        System.out.println(ans.toString());
    }
}

//leetcode
/*class Solution {
    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
                fw.write("0");
            } catch (Exception e) {
            }
        }));
    }

    public String reverseVowels(String s) {
        // convert to char array
        char[] arr = s.toCharArray();

        int L = 0, R = arr.length - 1;

        while (L < R) {
            while (L < R && !isVowel(arr[L])) {
                L++;
            }
            while (L < R && !isVowel(arr[R])) {
                R--;
            }

            // swap vowels
            char temp = arr[L];
            arr[L] = arr[R];
            arr[R] = temp;

            L++;
            R--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        // TODO: complete this small function
        return "aeiouAEIOU".indexOf(c) != -1;
    }
} */
