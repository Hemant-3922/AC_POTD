import java.util.Scanner;

public class E_Santa_s_Magic_Workshop_Progress_Bar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int t=sc.nextInt();

        int[] ar=new int[n];
        int sum=(int)((n*k*t)/100);
        int full=sum/k;
        int ai=sum%k;
        int i=0;
        for( i=0;i<full;i++){
            ar[i]=k;
        }
       if(ai > 0 && i < n){
            ar[i] = ai;
            i++;
        }
        for(;i<ar.length;i++){
            ar[i]=0;

        }
        for(int j:ar){
            System.out.print(j+" ");
        }

    }
}