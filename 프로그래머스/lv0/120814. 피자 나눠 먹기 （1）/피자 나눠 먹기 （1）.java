class Solution {
    public int solution(int n) {
        int answer = 0;
        double pis = 7;
        if (n <= 7) {
            answer = 1;
        } else {
            double answers = Math.ceil(n / pis);
            answer = (int) answers;
        }
        return answer;
    }
}