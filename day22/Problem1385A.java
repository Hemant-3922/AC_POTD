package day22;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1385A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int ar[] = {x, y, z};
            Arrays.sort(ar);

            if (ar[1] != ar[2]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(ar[0] + " " + ar[0] + " " + ar[2]);
            }
        }
        sc.close();
    }
}
