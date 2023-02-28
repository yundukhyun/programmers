class Solution {
    public int solution(int n) {
        int answer = 0;
        int n1 = 0;
        for (int i = 1; i <= n; i++) {
            int n2 = 0;
            for (int j = 1; j <= i; j++) {
                if(i%j ==0){
                    n2++;
                }
                if(n2 ==3){
                    n1++;
                    break;
                }
            }
        }
            answer = n1;

        return answer;
    }
}