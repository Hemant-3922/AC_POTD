package day5;

import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] bits=new String[n];
        for(int i=0;i<n;i++){
            bits[i]=sc.nextLine();
        }
        int x=0;

        for(int i=0;i<n;i++){
            if(bits[i].contains("++"))
               x=x+1;
            else if(bits[i].contains("--")){
               x=x-1;
            }
        }
        System.out.println(x);

    }
    
}
