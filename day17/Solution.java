package day17;
class Solution {
    public int compareVersion(String version1, String version2) {
        String s1[]=version1.split("\\.");
        String s2[]=version2.split("\\.");
        int i=0,j=0;
        while(i<s1.length||j<s2.length){
            
            
            int r1 = (i < s1.length) ? Integer.parseInt(s1[i]) : 0;
            int r2 = (j < s2.length) ? Integer.parseInt(s2[j]) : 0;
            // if(r1==r2)continue;
             if(r1<r2)return -1;
             if(r1>r2) return 1;
             i++;
             j++;
        }
        return 0;
    }
}
/* Grouping Anagram
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map=new HashMap<>();
        for(String s:strs){
            char[] ar=s.toCharArray();
            Arrays.sort(ar);
            
            // int[] count=new int[26];
            // for(char c:s.toCharArray()){
            //     count[c-'a']++;
            // }
            // StringBuilder sb=new StringBuilder();
            // for(int i:count){
            //     sb.append('#');
            //     sb.append(i);
            // }
            String key=new String(ar);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
} */