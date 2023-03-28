class Solution {
    public long solution(String numbers) {
        String sum = "";
		long answer = 0;
		for(int i = 0; i<=50; i++) {
			if(i == numbers.length()) {
				break;
			}
			for(int j =0; j<5; j++) {
				if(numbers.substring(i,i+3).equals("one")) {
					sum+="1";
					i+=2;
					break;
				}
				if(numbers.substring(i,i+3).equals("two")) {
					sum+="2";
					i+=2;
					break;
				}
				if(numbers.substring(i,i+3).equals("six")) {
					sum+="6";
					i+=2;
					break;
				}
				if(numbers.substring(i,i+4).equals("zero")) {
					sum+="0";
					i+=3;
					break;
				}
				if(numbers.substring(i,i+4).equals("four")) {
					sum+="4";
					i+=3;
					break;
				}
				if(numbers.substring(i,i+4).equals("five")) {
					sum+="5";
					i+=3;
					break;
				}
				if(numbers.substring(i,i+4).equals("nine")) {
					sum+="9";
					i+=3;
					break;
				}
				if(numbers.substring(i,i+5).equals("three")) {
					sum+="3";
					i+=4;
					break;
				}
				if(numbers.substring(i,i+5).equals("seven")) {
					sum+="7";
					i+=4;
					break;
				}
				if(numbers.substring(i,i+5).equals("eight")) {
					sum+="8";
					i+=4;
					break;
				}
			}
			
		}
		answer = Long.parseLong(sum);
        return answer;
    }
}