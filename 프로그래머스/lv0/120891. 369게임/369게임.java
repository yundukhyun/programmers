import java.util.stream.Stream;
class Solution {
    public int solution(int order) {
        int[] arrOrder = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        int answer = 0;
        for (int i = 0; i < arrOrder.length; i++) {
            if(arrOrder[i]== 3 || arrOrder[i]== 6 || arrOrder[i]== 9){
                answer++;
            }
        }
        return answer;
    }
}