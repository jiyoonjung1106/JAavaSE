package day03.conditional;
/*
 * [[조건문]]
 * 	주어진 조건식의 결과에 따라 별도의 명령을 수행하도록 제어하는 명령문
 * 
 * if문 사용법
 * 
 * if(조건식) {
 * 			조건식  true일 때 실행 명령문
 * } else if(조건식2) {
 * 		조건식1  false  조건식 2가 true일 때 실행 명령문
 * } else {
 * 		모든 조건식이 false 일 때 실행 명령문
 * 
 */
public class MainClass01 {
		public static void main(String[] args) {
			int num = 11;
			if(num % 2==0) {
				System.out.println("num은 짝수입니다.");
			}
			if(num % 2 !=0) {
				System.out.println("num은 홀수입니다.");
			}
			
			double num2 = 13.3;
			if(num2 %3 ==0) {
				System.out.println("num2는 나머지가 0입니다.");
			} else if(num2%3 ==1) {
				System.out.println("num2는 나머지가 1입니다.");
			}
			else if(num2%3 ==2) {
				System.out.println("num2는 나머지가 2입니다.");
			}
			else {
				System.out.println("정수가 아닙니다.");
			}
			
			int num3 = 23;
			if(num3%2 ==0) {
				System.out.println("num은 짝수입니다.");
			} else {
				System.out.println("num은 홀수입니다.");
			}
			
			if(num3%2 ==0) 
				System.out.println("num은 짝수입니다.");
			 else 
				System.out.println("num은 홀수입니다.");
			
		
		}
}
