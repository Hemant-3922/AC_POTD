package day2;
import java.util.Scanner;

public class Farmer {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ar[]=new int[t];
        for(int i=0;i<t;i++){
            ar[i]=sc.nextInt();}

        for(int i=0;i<t;i++){
            if(ar[i]%2!=0){
                System.out.println("0");
            }
            else{
                System.out.println((ar[i]/4)+1);
            }
        }
            
    }
    
}
