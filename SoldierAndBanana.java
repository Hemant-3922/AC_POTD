import java.util.Scanner;

class SoldierAndBanana{
    public static void main(String[] args){
        int k,n,w;
        Scanner sc=new Scanner(System.in);
         k=sc.nextInt();
         n=sc.nextInt();
         w=sc.nextInt();
        int total=0;
        for(int i=1;i<w+1;i++){
          total=total+i*k;   
        }
        System.out.println(Math.max(total-n, 0));
    }
}