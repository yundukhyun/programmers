class Solution {
    public double solution(int[] numbers) {
        double a = 0;
        int i = 0;
        for (; i <numbers.length ; i++) {
            a += numbers[i];
        }
        double answer = a/i;

        return answer;
    }
}