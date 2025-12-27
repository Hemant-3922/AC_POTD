import java.util.Scanner;

public class D_Santa_s_Magical_Numbers {
    public static boolean isPrime(long n){
         if (n < 2) return false;
        if (n == 2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;

        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            
           if(n < 6) {
                System.out.println("NO");
                continue;
            }
            
            if(n % 2 == 0) {
                System.out.println("YES");
                continue;
            }
            
            if(isPrime(n-2))System.out.println("YES");
            else System.out.println("NO");
        }

    }
}