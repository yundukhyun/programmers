class Solution {
    public int[] solution(int n) {
        double s = 2;
        double t = 0;
        int j=0;
        if(n/s <Math.ceil(n/s)){
            t = Math.ceil(n/s);
        }else{
            t = n/s;
        }
        int nst = (int)t;
        int [] answer = new int[nst];
        for (int i = 1; i <= n; i++ ) {

            if(i % 2 ==1){
               answer[j] = i;
                j += 1;

                
                }

            }
        return answer;
    }
}