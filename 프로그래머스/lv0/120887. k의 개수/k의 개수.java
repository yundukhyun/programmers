class Solution {
    public int solution(int i, int j, int k) {
        int sum= 0;
        for (int l = i; l <= j; l++) {
            sum++;
        }
        String [] numbers = new String[sum];
        int answer = 0;
        for (int l = 0; l <= numbers.length; l++) {
            if(i <= j){
                numbers[l] = String.valueOf(i);
                ++i;
            }

        }
        String ks =String.valueOf(k);
        for (int l = 0; l < numbers.length; l++) {
            for (int m = 0; m < numbers[l].length(); m++) {
                if(ks.equals(String.valueOf(numbers[l].charAt(m))) ){
                    answer++;
                }
            }
        }
        return answer;
    }
}