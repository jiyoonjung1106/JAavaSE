package day07.abstractEx;

import day07.mypac.Man;
import day07.mypac.Woman;

/*
 * [[ 추상클래스(Abstract Class) ]]
 * 	구현되지 않은 추상 메소드가 존재한다.
 * 	정의만 하고 구현X
 * 	미완성 클래스
 * 	미완성 메소드를 가지고 있다.
 * 	상속을 받고 반드시 오버라이딩 해야한다.
 * 
 * import 단축기 : Ctrl+ shift + 0 : 임포트 단축키
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
//		추상클래스는 객체 생성할 수 없다.
//		Human h1 = new Human();
		
		Man m1 = new Man();
		m1.useFire();
		m1.say();
		
		Woman w1 = new Woman();
		w1.useFire();
		
	}

}
