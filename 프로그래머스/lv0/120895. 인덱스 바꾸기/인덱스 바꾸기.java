class Solution {
    public String solution(String my_string, int num1, int num2) {
        String[] string1 = new String[my_string.length()];
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if(i != num1 && i != num2){
                string1[i] = String.valueOf(my_string.charAt(i));
            }
            if(num2 == i){
                string1[num1] = String.valueOf(my_string.charAt(i));
            }
            if(num1 == i){
                string1[num2] = String.valueOf(my_string.charAt(i));
            }
        }
        for (int i = 0; i < string1.length; i++) {
            answer += string1[i];
        }
        return answer;
    }
}