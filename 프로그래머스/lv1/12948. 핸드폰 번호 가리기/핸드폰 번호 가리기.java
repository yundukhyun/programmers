class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String a = phone_number.substring(0,phone_number.length()-4);
        String b = phone_number.substring(phone_number.length()-4);
        
        String c = a.replaceAll(".","*");
    
        return c+b;
    }
}