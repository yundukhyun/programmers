class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sideTotal = 0;
        int max = sides[0];

        for(int i=0 ; i<sides.length ; i++) {
            sideTotal += sides[i];
            if(sides[i] > max) {
                max = sides[i];
            }
        }
        if(sideTotal-max > max){
            answer = 1;
        }else{
            answer = 2;
        }
        return answer;
    }
}