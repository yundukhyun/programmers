import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
		String [] sArrays = s.split(" ");
		int [] sArray = new int[sArrays.length];
		
		for(int i = 0; i < sArrays.length; i++) {
			sArray[i] = Integer.parseInt(sArrays[i]);
		}
		Arrays.sort(sArray);
		answer += sArray[0];
		answer += " ";
		answer += sArray[sArray.length-1];
        return answer;
    }
}