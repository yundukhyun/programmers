class Solution {
    public int solution(String s) {
        String [] ss = s.split("\\s");
		int answer = 0;
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].equals("Z")) {
				answer -= Integer.parseInt(ss[i-1]);
				continue;
			}
			answer += Integer.parseInt(ss[i]);
		}
        return answer;
    }
}