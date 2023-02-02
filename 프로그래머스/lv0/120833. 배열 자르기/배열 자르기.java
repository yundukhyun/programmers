class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int num3 = (num2-num1)+1;
        int[] answer = new int[num3];
        int answers = 0;
        for (int i = num1; i <=num2; i++) {
            answer[answers] = numbers[i];
            answers++;
        }
        return answer;
    }
}