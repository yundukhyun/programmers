import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(String s) {
        String [] ss = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ss[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(ss,Comparator.reverseOrder());
        String answer = "";
        for (int i = 0; i <ss.length ; i++) {
            answer += String.valueOf(ss[i]);
        }
        return answer;
    }
}