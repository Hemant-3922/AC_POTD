package day4;
class Solution {
    public int gcd(int a,int b){
        if(b==0)
           return Math.abs(a);
           else
        return gcd(b, a % b); 
    }
    public int findGCD(int[] nums) {
        int minValue=Integer.MAX_VALUE;
         int maxValue=Integer.MIN_VALUE;
         for(int i:nums){
            minValue=Math.min(i,minValue);
            maxValue=Math.max(i,maxValue);
         }
         return gcd(maxValue,minValue);
         
    }
}