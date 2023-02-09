package day09.innerclass;

import day09.mypac.Weapon;

/*
 * [[ 익명 클래스(AnonyMous Class) ]]
 * 	클래스 선언과 객체생성을 동시에 하는 이름없는 클래스
 * 	일회용 클래스 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		Weapon w = new Weapon() {
			
			int damage = 10;

			@Override
			public void attack() {
				System.out.println(damage+ "데미지로 공격!!");
			}
			
		};
		w.attack();
		
		Weapon w2 = new Weapon() {
			
			int damage = 15;
			int damage2 = 15;
			int damage3 = 15;

			@Override
			public void attack() {
				System.out.println(damage+"데미지로 공격");
			}
			
		};
		w2.attack();
		
	}
}
