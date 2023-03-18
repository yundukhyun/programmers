class Solution {
    public int solution(int[] array) {
        int answer = 0;
		String[] strarray = new String[array.length];
		
		for (int i = 0; i < array.length; i++) {
			strarray[i] = String.valueOf(array[i]);
		}
		for (int i = 0; i < strarray.length; i++) {
			for (int j = 0; j < strarray[i].length(); j++) {
				if(((int)strarray[i].charAt(j)) == 55) {
					answer += 1;
				}
				
			}
		}
        return answer;
    }
}