package day18;
class Solution {
   
    public boolean rotateString(String s, String goal) {
         if(s.length() != goal.length()) return false;

        return (s+s).contains(goal);
        // if(s.equals(goal))return true;
        // StringBuilder sb=new StringBuilder(s);
        // for(int i=1;i<s.length();i++){
        //     sb.append(sb.charAt(0));
        //    sb.deleteCharAt(0);
        //    String ans=sb.toString();
        //    if(ans.equals(goal))return true;
        // }
        // return false;
        
    }
}