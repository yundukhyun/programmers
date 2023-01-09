class Solution {
    public int solution(int n, int k) {
        int n1 = n/10;
        int k1 = k-n1;      
        int n2 = n*12000;
        int k2 = k1*2000;
        int answer = n2+k2;
        return answer;
    }
}