import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int [] emergency) {
        Integer [] emergencyss =  Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        int [] answer = new int[emergency.length];
        int [] emergencys = new int[emergency.length];
        int num=  1;
        for (int i = 0; i < emergency.length; i++) {
            emergencys[i] = emergency[i];
        }
        Arrays.sort(emergencyss, Collections.reverseOrder());
        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if(emergencyss[i]== emergencys[j]){
                    answer[j] = num;
                    num++;
                }
            }
        }
        return answer;
    }
}