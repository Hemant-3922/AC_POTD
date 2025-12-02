public class BaseballScore {
    public int calPoints(String[] operations) {
     int[] arr=new int[operations.length];
     int idx=0;
     for(int i=0;i<operations.length;i++)
     {
        String op=operations[i];
        if(op.equals("C"))
        idx--;
         else if(op.equals("D")){
        arr[idx]=arr[idx-1]*2;
        idx++;
         }
        else if(op.equals("+"))
        {
        arr[idx]=arr[idx-1]+arr[idx-2];
        idx++;
        }
         else
         {
         arr[idx]=Integer.parseInt(op);
        idx++;
         }


     }
     int sum=0;
     for(int i=0;i<idx;i++){
      sum+=arr[i];
     }
     return sum;
    }
}