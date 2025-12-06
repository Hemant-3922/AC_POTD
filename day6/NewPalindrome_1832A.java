package day6;

import java.util.Scanner;

public class NewPalindrome_1832A{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        
        while(t-->0){
            String s=sc.nextLine();
            if(isNewPallindrome(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }

       public static  boolean isNewPallindrome(String s){
        boolean allSame=true;
        for(int i=0;i<s.length();i++){
            int n=s.length();
            if(n % 2 == 1 && i == s.length()/2)continue;
            if(s.charAt(i)!=s.charAt(0)){
                allSame=false;
                break;
            }
        }
        if(allSame)return false;

        if(s.length()<=2)return false;
        
            return true;
        }
}