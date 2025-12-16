package day14;

import java.util.Scanner;

public class AddModulo10 {

    public static boolean xor(int[] ar) {
        int x = 0;
        for (int i = 0; i < ar.length; i++) {
            x = x ^ ar[i];
        }
        return x == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = 0;
        String[] ans = new String[t];

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            int flag = 0;

            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }

            for (int i = 0; i < ar.length; i++) {
                ar[i] = ar[i] + (ar[i] % 10);
            }

            if (xor(ar)) flag = 1;

            if (flag == 1) ans[k] = "YES";
            else ans[k] = "NO";

            k++;
        }

        for (String s : ans) {
            System.out.println(s);
        }
        sc.close();
    }
}
