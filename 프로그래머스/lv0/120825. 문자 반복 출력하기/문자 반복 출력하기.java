class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] my_strings = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            my_strings[i]= String.valueOf(my_string.charAt(i)).repeat(n);
            answer += my_strings[i];
        }
        return answer;
    }
}