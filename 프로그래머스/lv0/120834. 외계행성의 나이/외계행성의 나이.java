class Solution {
    public String solution(int age) {
        String age_string = Integer.toString(age);
        String []age_string_array= new String[age_string.length()];
        String answer = "";
        for (int i = 0; i < age_string.length(); i++) {
            age_string_array[i] = String.valueOf(age_string.charAt(i));
           if(age_string_array[i].equals("0")){
               answer += "a";
           }
            if(age_string_array[i].equals("1")){
                answer += "b";
            }
            if(age_string_array[i].equals("2")){
                answer += "c";
            }
            if(age_string_array[i].equals("3")){
                answer += "d";
            }
            if(age_string_array[i].equals("4")){
                answer += "e";
            }
            if(age_string_array[i].equals("5")){
                answer += "f";
            }
            if(age_string_array[i].equals("6")){
                answer += "g";
            }
            if(age_string_array[i].equals("7")){
                answer += "h";
            }
            if(age_string_array[i].equals("8")){
                answer += "i";
            }
            if(age_string_array[i].equals("9")){
                answer += "j";
            }
        }
       return answer;
    }
}
