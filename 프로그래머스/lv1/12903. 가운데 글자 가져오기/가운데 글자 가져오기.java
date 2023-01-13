class Solution {
    public String solution(String s) {
        int a = s.length();
        if (a%2==0){
           String b = s.substring((a/2-1),(a/2+1));
            return b;
        }else{
            String c = s.substring((a/2),(a/2+1));
            return c;
        }
    }
}