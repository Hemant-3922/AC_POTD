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
