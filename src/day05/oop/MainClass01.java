package day05.oop;

import day05.mypac.Card;

/*
 * 	OOP(Object Oriented Programming) - 객체지향 프로그래밍
 * 
 * [[ 객체란(Object)란]]
 * 	물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서
 * 	정의가능 식별 가능한 것을 말한다.
 * 	
 * 	예 ) 물리적인 것 - 모니터, 컴퓨터, 자동차, 휴대폰, 학생, 회원
 * 		추상적인 것 - 주문, 회계, 생산, 주식
 * 
 * 	자바에서는 최소한의 프로그램 단위
 * 
 * 객체를 만들기 위해서는 주형(와플틀) 또는 설계도  => Class
 * 
 * Class에 작성된 코드를 읽어 객체화한다 => 메모리에 올린다!!
 * 
 * 클래스 구조
 * Class 클래스명 (extend 상속) (implements  인터페이스상속){
 * 		(생성자) => 초기화
 * 		변수(멤버변수, 멤버필드)		=> 속성값
 * 		메소드(멤버메소드)  	=> 기능
 * }
 * 
 * 
 * 	객체화
 * 	클래스명 변수명 = new 클래스명();
 * 
 * 	객체 구성요소 
 * 		(생성자) => 초기화
 * 		변수		=> 속성값
 * 		메소드  	=> 기능
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Card card = new Card();
		
		System.out.println(card.type);
		System.out.println(card.number);
		
		card.number = "10";
		System.out.println(card.number);
		
	}

}
