import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
		int answer =0;
		BigInteger ballsFactorial = BigInteger.ONE;
		BigInteger shareFactorial = BigInteger.ONE;
		BigInteger shareFactorials = BigInteger.ONE;
		for(int i =1; i<=balls;i++ ) {
			ballsFactorial=ballsFactorial.multiply(BigInteger.valueOf(i));
		}
		for(long i =1; i <=balls-share; i++) {
			shareFactorial=shareFactorial.multiply(BigInteger.valueOf(i));
		}
		for(long i =1; i <=share; i++) {
			shareFactorials=shareFactorials.multiply(BigInteger.valueOf(i));
		}
		ballsFactorial = ballsFactorial.divide(shareFactorial.multiply(shareFactorials));
		answer = ballsFactorial.intValue();
        return answer;
    }
}