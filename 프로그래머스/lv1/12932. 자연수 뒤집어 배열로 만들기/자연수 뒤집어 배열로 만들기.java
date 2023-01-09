class Solution {
    public int[] solution(long n) {
        String longnumber = Long.toString(n);
        int lengths = longnumber.length();
        int[] answer = new int[lengths];
        int [] base = new int[lengths];
        int i = 0;
        for (; i < longnumber.length(); i++) {
            base[i] +=((longnumber.charAt(i))-'0');
        }

        for (int k = base.length - 1, j = 0; k >= 0; k--, j++) {
            answer[j] = base[k];
        }
        return answer;
    }
}