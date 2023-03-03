class Solution {
    public int[] solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i == 0){
                count++;
            }
        }
        int [] answer = new int[count];
        int d = 0;
        answer[0] = 1;
        for (int i = 1; i < answer.length; i++) {
            for (int j = 1+answer[i-1]; j <= n; j++) {
                if(n%j == 0){
                    answer[i] = j;
                    break;
                }
            }
        }
        return answer;
    }
}