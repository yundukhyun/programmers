import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = numbers[0]* numbers[1];
        Arrays.sort(numbers);
        int numbers1 = numbers[0] * numbers[1];
        int numbers2 = numbers[numbers.length-1] * numbers [numbers.length-2];

        if(numbers1>numbers2){
            answer = numbers1;
        }
        if(numbers1<numbers2){
            answer = numbers2;
        }
        return answer;
    }
}