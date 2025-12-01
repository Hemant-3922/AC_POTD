import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        boolean ar[]=new boolean[t];
        int a,b,c,d;
        for(int i=0;i<t;i++){
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        if(a==b&&b==c&&c==d)
           ar[i]=true;
         else
           ar[i]=false;

        }
        for(int i=0;i<t;i++){
            if(ar[i])
                System.out.println("YES");
            else
                System.out.println("NO");
        }

       
sc.close();
        
        
    }
    
}
