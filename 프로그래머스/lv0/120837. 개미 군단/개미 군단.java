class Solution {
    public int solution(int hp) {
        int General = hp/5;
        int soldier = hp%5/3;
        int c = hp%5%3/1;
        int answer = 0;
        answer = General+soldier+c;
        return answer;
    }
}