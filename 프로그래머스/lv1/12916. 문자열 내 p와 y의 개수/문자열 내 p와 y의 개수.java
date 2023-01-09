class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        char p = 'p';
        char P = 'P';
        char y = 'y';
        char Y = 'Y';
        for (int i = 0; i <s.length(); i++) {

            if (s.charAt(i) ==p ||s.charAt(i) ==P){
                countP++;
            }
            if (s.charAt(i) ==y||s.charAt(i) ==Y){
                countY++;
            }
            
            if(countP==countY){
                answer = true;
            }else {
                answer = false;
            }
        }
        return answer;
    }
}