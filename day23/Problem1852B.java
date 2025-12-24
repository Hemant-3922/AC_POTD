package day23;
import java.io.BufferedInputStream;
import java.util.Scanner;

public class Problem1852B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long total = 0;
            long product = 1;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) total++;
                else if (x == 0) product *= 2;
            }

            System.out.println(total * product);
        }
        sc.close();
    }
}
