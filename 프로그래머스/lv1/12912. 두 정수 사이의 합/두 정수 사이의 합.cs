public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int c = 0;
        if(a<b){
            while(a<=b){
                answer += a;
                ++a;
            }

            } else{
            while(b<=a){
                answer += b;
                ++b;
            }

        }
        return answer;
    }
}