class Solution {
    public int solution(String my_string) {
        String[] my_str = my_string.split(" ");
		int answer = Integer.parseInt(my_str[0]);
		for(int i = 0; i < my_str.length; i++) {
			if(my_str[i].equals("+")) {
				answer += Integer.parseInt(my_str[i+1]);
			}
			if(my_str[i].equals("-")) {
				answer -= Integer.parseInt(my_str[i+1]);
			}
		}
        return answer;
    }
}