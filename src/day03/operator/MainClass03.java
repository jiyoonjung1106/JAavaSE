package day03.operator;
/*
 * 3. 비교 연산자
 * 연산 결과를  boolean으로 반환한다.
 *  > : 크다
 *  >= : 크거나 같다
 *  < : 작다
 *  <= : 작거나 같다
 *  == : 같다
 *  != : 다르다
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		boolean result = 10 < 20;
		if(result) {
			System.out.println("10은 20보다 작다.");
		} else {
			System.out.println("10은 20보다 크다.");
		}
	}
}
