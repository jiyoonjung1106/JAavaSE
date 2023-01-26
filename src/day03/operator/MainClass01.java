package day03.operator;
/*
 * [[연산자]]
 * 1. 산술연산자
 * 	+, -, *, /, %
 *  
 */

public class MainClass01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// 두수의 합을 구해서  sum이라는 int형 변수에 대입
		// 숫자 + 숫자 = 두수의 합 
		int sum = num1 + num2;
		// 숫자+ 문자열은 문자열이다.
		// 문자열 + 는 연결연산이다.
		String result = num1 +"+"+num2+"="+sum;
		System.out.println(result);
		
		// 두 수의 곱을 구해서 multiply라는 변수에 대입
		int multiply = num1 * num2;
		System.out.println(num1+"*"+num2+"="+multiply);
		
		//나누기
		int resultNum = 10/3;
		System.out.println("10/3=" + resultNum);
		
		//9를 5로 나눈 나머지 값 resultNum2에 대입
		int resultNum2 = 9%5;
		System.out.println("9%5=" + resultNum2);
		
		//실수 계산 부동소수점 오차 생길 수 있다. 주의!!
		double resultDouble = 10/3.0;
		System.out.println("10/3.0" + resultDouble);
	}
}
