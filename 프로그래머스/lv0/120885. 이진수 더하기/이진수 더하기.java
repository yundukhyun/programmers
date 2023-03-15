class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
		int bin3 = 0;
		int bin33 = 1;
		int bin4 = 0;
		int bin44 = 1;
		int bin5 = 0;
		
		for (int i = bin1.length()-1; i >=0 ; i--) {
			if(i==bin1.length()-1 && ((int)(bin1.charAt(i)))== 49) {
				bin3 +=1;
			}
			if(i < bin1.length()-1 && ((int)(bin1.charAt(i)))== 49) {
				bin3 += bin33;
				
				}
			bin33 *= 2;
			}
		for (int i = bin2.length()-1; i >=0 ; i--) {
			if(i==bin2.length()-1 && ((int)(bin2.charAt(i)))== 49) {
				bin4 +=1;
			}
			if(i < bin2.length()-1 && ((int)(bin2.charAt(i)))== 49) {
				bin4 += bin44;
				
				}
			bin44 *= 2;
			}
		
		bin5 = bin3+bin4;
		answer = Integer.toBinaryString(bin5);
        return answer;
    }
}