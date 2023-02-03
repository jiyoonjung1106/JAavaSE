package day06.var;

import day06.mypac.Card;

/*
 * [[변수(variable)]]
 * 메모리 공간에 붙여진 이름.
 * JAVA 프로그램 사용되는 모든 값을 메모리 공간에 저장.
 * 메모리 공간에 이름을 붙여 접근가능.
 * 
 * 변수 선언및 초기화
 * 자료형 변수명 = 값
 * 
 * 1. 타입의 따른 변수
 * 		기본형 - 예약어, 소문자로 시작, 값을 가지고 있다.
 * 			8가지(boolean,byte, short, char, int, long, float, double) 
 * 		참조형 - 대문자로 시작을 하고, 주소값을 가지고 있다.
 * 			기본형 외 나머지 전부!
 * 			 ex) String
 * 
 * 2. 선언 위치에 따른 변수 
 * 		전역변수 - 클래스 안에 선언(멤버변수)
 * 				 초기화 하지 않으면 default  값이 들어간다.
 * 				 boolean - false
 * 				 정수형 - 0
 * 				 실수형 - 0.0
 * 				 참조형 - null
 * 		지역변수 - 메소드 또는 생성자 안에 선언
 *			     중괄호{ }안에 선언된 변수 또는 매개변수.
 *				 반드시 초기화 해줘야 한다!! (컴파일 에러) 
 *
 * 3. 정적(static)	/ 동적 변수
 * 		정적 - static 붙은 멤버 변수
 * 			  모든 객체가 공유한다.
 * 			  클래스명으로 접근 가능.
 * 		동적 - static이 아닌 일반 멤버변수
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
			Card card1 = new Card();
			Card card2 = new Card();
			Card card3 = new Card();
			
			Card.type = "Diamond";
			Card.type = "Heart";
			System.out.println(card1.type);
			System.out.println(card2.type);
			System.out.println(card3.type);
			
			Card.width = 124;
			Card.height = 176;
			System.out.println(card1.width);
			System.out.println(card1.height);
			System.out.println(card2.width);
			System.out.println(card2.height);
			System.out.println(card3.width);
			System.out.println(card3.height);
			
			Card.type = "Clover";
			System.out.println(card1.type);
			System.out.println(card2.type);
			System.out.println(card3.type);
	}

}
