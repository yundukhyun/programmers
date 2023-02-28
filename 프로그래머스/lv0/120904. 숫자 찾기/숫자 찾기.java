import java.util.stream.Stream;
class Solution {
    public int solution(int num, int k) {
       int[] arrOrder = Stream.of(String.valueOf(num).split("")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = 0; i < arrOrder.length; i++) {
            if(arrOrder[i] == k){
                answer = i+1;
                break;
            }
            if(i == arrOrder.length-1 && arrOrder[i] != k){
                answer = -1;
            }
        }
        return answer;
    }
}