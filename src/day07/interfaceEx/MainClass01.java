package day07.interfaceEx;

import day07.mypac.AkWeapon;

/*
 * [[인터페이스(interface) ]]
 * 추상 메소드만 존재한다.
 * 변수 선언을 해도 변수가 아닌 상수가 된다.
 * 다중 상속 가능!
 * 
 * 객체 구조(뼈대)를 만들어준다
 * 
 * 
 */



public class MainClass01 {
	public static void main(String[] args) {
			AkWeapon ak47 = new AkWeapon();
			ak47.attack();
			
			
			System.out.println(ak47.NAME);
	}

}
