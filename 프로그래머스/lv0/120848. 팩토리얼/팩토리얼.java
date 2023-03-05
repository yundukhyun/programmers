class Solution {
    public int solution(int n) {
        int sum = 1;
      int answer =0;
        for (int i = 1; i <= 10; i++) {
            sum *= i;
            if(n < sum){
                answer = i-1;
                break;
            }
            if(sum == 3628800){
                answer = 10;
            }
        }
        return answer;
    }
}