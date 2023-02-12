class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int [] arrays = new int[1000];
        int max = 0;
        int max2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        
            for (int j = 0; j < array.length; j++) {
                    arrays[array[j]] ++;
            }

        for (int i = 0; i < arrays.length; i++) {

            if(max2 < arrays[i]){
                max2 = arrays[i];
                answer = i;
            }else{
                if(max2 == arrays[i]){
                    max2= arrays[i];
                    answer = -1;
                }
            }
            
        }
        return answer;
    }
}