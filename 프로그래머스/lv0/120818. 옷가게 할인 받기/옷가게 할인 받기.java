class Solution {
    public int solution(int price) {
        int answer = 0;
        if(price >= 500000) {
        price *= 0.8;
            answer = price;
        } else if(price >= 300000) {
        price *= 0.9;
            answer = price;
        } else if(price >= 100000) {
        price *= 0.95;
            answer = price;
        }else if(price < 100000){
            answer = price;
        }   
        return answer;
    }
}