package day02;
/*
 * [[ 기본 자료형 ]]
 * 1. 논리형(boolean)
 * 
 * - 선언방법
 *  boolean  변수명;
 *  - 가질 수 있는 범위
 *   true, false 두가지 값 저장 가능.
 * 
 */
public class MainClass02 {
	
	public static void main(String[] args) {
		// 논리형 지역변수 선언하기
		boolean isWait ;
		// 선언한 변수에 값 대입하기
		isWait = true;
		// 저장된 값을 문자열로 출력하기
		System.out.println("논리형 변수에 저장된 값 : " + isWait);
		
		//지역변수는 초기화 필수(값 대입 필수)
		boolean canRun = false;
		
		canRun = true;
		System.out.println(canRun);
	}

}
