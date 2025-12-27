import java.util.Scanner;

public class C_The_Glitched_Nice_List_Calculator {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s1=sc.next();
      String s2=sc.next();

      StringBuilder sb=new StringBuilder();
      int i=s1.length()-1;
      int j=s2.length()-1;
      while(i>=0||j>=0){
 
            int d1 = (i >= 0) ? s1.charAt(i) - '0' : 0;  
            int d2 = (j >= 0) ? s2.charAt(j) - '0' : 0;  

            sb.insert(0, d1 + d2);

            i--;
            j--;
        }
        System.out.println(sb.toString());
    
    }
}