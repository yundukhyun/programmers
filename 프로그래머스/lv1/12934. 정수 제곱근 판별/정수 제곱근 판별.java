class Solution {
    public long solution(long n) {
        long answer = 0;
        double l = Math.sqrt(n);

        for (long i = 0; i <= l; i++) {
            if(i == l){
                answer=(i+1)*(i+1);
            }else{
                answer = -1;
            }
        }
        return answer;
    }
}