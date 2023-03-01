import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int j = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                n++;
            }
        }
        if(n ==0){
            n =1;
        }
        int [] answer = new int[n];
        answer[0] = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                answer[j] = arr[i];
                j++;
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}