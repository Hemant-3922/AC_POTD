import java.util.Scanner;

public class A_Santa_and_the_Gifts {

    public static void main(String[] args) {
        long sum=0;
        Scanner sc=new Scanner(System.in);
        long t=sc.nextInt();
        long power=1;
        while(sum<t){
            sum=sum+power;
           power*=2;
        }
        if(sum==t)System.out.println("YES");
        else System.out.println("NO");
    }
}