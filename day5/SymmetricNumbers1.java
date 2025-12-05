package day5;
class SymmetricNumbers1{
    public int countDigits(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;

    }
    public int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n/=10;
        }
        return sum;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            int totalDigits=countDigits(i);
            if(totalDigits%2==0){
                int firstHalf=i/((int)Math.pow(10,totalDigits/2));
                int secondHalf=i%((int)Math.pow(10,totalDigits/2));
                if(sumOfDigits(firstHalf)==sumOfDigits(secondHalf)){
                    count++;
                }
            }
        }
        return count;
    }
}