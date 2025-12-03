import java.util.Scanner;

public class A_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long m = sc.nextLong();
        long n = sc.nextLong();
        long a = sc.nextLong();

        long result = ((m + a - 1) / a) * ((n + a - 1) / a);
        System.out.println(result);
    }
}
