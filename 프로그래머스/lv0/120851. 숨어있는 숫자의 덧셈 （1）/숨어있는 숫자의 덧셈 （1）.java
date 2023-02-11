class Solution {
    public int solution(String my_string) {
        char my_strings = 0;
        int answer = 0;
        for (int i = 0; i < my_string.length(); i++) {
            my_strings =  my_string.charAt(i);
            if(my_strings ==49){
                answer += 1;
            } else if (my_strings == 50) {
                answer += 2;
            }else if (my_strings == 51) {
                answer += 3;
            }else if (my_strings == 52) {
                answer += 4;
            }else if (my_strings == 53) {
                answer += 5;
            }else if (my_strings == 54) {
                answer += 6;
            }else if (my_strings == 55) {
                answer += 7;
            }else if (my_strings == 56) {
                answer += 8;
            }else if (my_strings == 57) {
                answer += 9;
            }else{
                answer +=0;
            }
        }
        return answer;
    }
}