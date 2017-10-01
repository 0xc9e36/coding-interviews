public class Solution {
    public String replaceSpace(StringBuffer str) {
        String res = "";
        int i = 0, N = str.length();
        while(i < N) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                res += "%20";
            } else {
                res += String.valueOf(ch);
            }
            i++;
        }
        return res;
    }
}
