class Solution {
    public int solution(int left, int right) {
        int answer = 0;
		
		int num=0;
		
		for(int i = left; i <= right; i++) {
			num++;
		}
		int [] sum = new int[num];
		int [] sums = new int[num];
		for(int i = 0; i < sum.length; i++) {
			sum[i] = left;
			left++;
		}
		for(int i = 0; i < sum.length; i++ ) {
			for(int j = 1; j <= sum[i]; j++ ) {
				if(sum[i]%j ==0 ) {
					sums[i] +=1;
				}
			}
		}
		for(int i = 0; i < sums.length; i++ ){
			if(sums[i]%2 ==0) {
				answer +=sum[i];
			}else {
				answer -=sum[i];
			}
		}
        return answer;
    }
}