package day16;
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        if (s.length() == 0)
            return "";

        String[] StringArray = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        int n = StringArray.length;
        for (int i = n - 1; i >= 0; i--) {
            sb.append(StringArray[i]);
            if (i != 0)
                sb.append(" ");
        }
        return sb.toString();

    }
}