import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
		Arrays.sort(sides);
		for(int i = 1; i <= sides[1]; i++) {
			if(sides[0]+i >sides[1]) {
				answer++;
			}
		}
		for(int i = 1; i < sides[0]+sides[1]; i++) {
			if(sides[1]< i) {
				answer++;
			}
		}
        return answer;
    }
}