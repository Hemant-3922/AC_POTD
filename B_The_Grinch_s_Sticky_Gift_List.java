import java.util.Scanner;

public class B_The_Grinch_s_Sticky_Gift_List {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int k=sc.nextInt();
        int n=s.length();
        int mistake=0;
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<n){
            char c=s.charAt(i);
            int j=i;
            while(j<n&&s.charAt(j)==c){
                j++;
            }
            sb.append(c);
            if(j-i>1)mistake++;
            i=j;
            
        }
        if(mistake<=k)System.out.println(sb.toString());
        else System.out.println("NO");
    }
}