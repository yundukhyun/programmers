import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        String [] ABC = {"a","b","c","d","e","f","g","h","i","j","k","l","n","m","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","N","M","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int [] before1 =new int[ABC.length];
        int [] after1 =new int[ABC.length];
        int answer = 0;
        for (int i = 0; i < before.length(); i++) {
            for (int j = 0; j < ABC.length; j++) {
                if(ABC[j].equals(String.valueOf(before.charAt(i)))) {
                    before1[j]++;
                }
            }
        }
        for (int i = 0; i < after.length(); i++) {
            for (int j = 0; j < ABC.length; j++) {
                if(ABC[j].equals(String.valueOf(after.charAt(i)))) {
                    after1[j]++;
                }
            }
        }
        if(Arrays.toString(before1).equals(Arrays.toString(after1))){
            answer = 1;
        }
        return answer;
    }
}