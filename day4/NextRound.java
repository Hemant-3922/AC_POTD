package day4;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int count=0;
        int ans= ar[k-1];
        for(int i=0;i<n;i++){
            if(ar[i]>=ans && ar[i]>0)
                    count++;
                
        }
        System.out.println(count);


    }
    
}
