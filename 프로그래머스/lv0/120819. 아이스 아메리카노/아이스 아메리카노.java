class Solution {
    public int[] solution(int money) {
        int[] answer = {};
        answer = new int[2];
        int coffee = 5500;
        if (money <5500){
            answer[0] = 0;
            answer[1] = money;
        }else{
            answer[0] = money/coffee;
            answer[1] = money%coffee;
        }
        return answer;
    }
}