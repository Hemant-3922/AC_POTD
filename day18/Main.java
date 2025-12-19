package day18;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int w=sc.nextInt();
            int ar[]=new int[w];
            for(int i=0;i<ar.length;i++){
                ar[i]=sc.nextInt();
               
            }
            for(int i=0;i<ar.length;i++){
                int b=sc.nextInt();
                String moves =sc.next();
                for (int j = 0; j < b; j++) {
                    char c = moves.charAt(j);
                    if(c=='D'){
                        ar[i] = (ar[i] + 1) % 10;
                    //     ar[i]++;
                    // if(ar[i]>9)
                    // ar[i]=ar[i]-10;
                   }
                   if(c=='U'){
                    ar[i] = (ar[i] + 9) % 10;
                    //     ar[i]--;
                    // if(ar[i]<0)
                    // ar[i]=ar[i]+10;
                   }
                }

            }
            for (int i = 0; i < w; i++) {
                System.out.print(ar[i] + " ");
            }
            System.out.println();

        }
    }
}
/*

2
0 9
9 DDDDDDDDD
9 UUUUUUUUU
 */