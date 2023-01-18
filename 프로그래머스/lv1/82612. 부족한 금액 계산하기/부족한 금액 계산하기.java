class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long pay = 0;
        long i = 0;
        for(;i<=count;++i) {
            pay += price * i;
        }
        answer = money-pay;
        if(answer>0){
           return 0;
        }else {
            return -answer;
        }
        
    }
}