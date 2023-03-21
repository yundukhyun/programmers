class Solution {
    public String[] solution(String my_str, int n) {
        int j = 1;
		int ArrayLength = 0;
		if(my_str.length()%n != 0) {
			ArrayLength = my_str.length()/n+1;
		}else {
			ArrayLength = my_str.length()/n;
		}
		System.out.println(my_str.length()/n);
		String[] answer = new String[ArrayLength];
		for(int i = 0; i <ArrayLength; i++ ) {
			if(n*j-1 < my_str.length()) {
				answer[i] = my_str.substring(i*n,n*j);
				j++;
			}else {
				answer[i] = my_str.substring(i*n,my_str.length());
			}	
			
		}
        return answer;
    }
}