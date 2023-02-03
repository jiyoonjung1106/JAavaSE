package day07.morphism;


import day07.mypac.AkWeapon;
import day07.mypac.M16;
import day07.mypac.M4A1Weapon;
import day07.mypac.Scope;
import day07.mypac.Weapon;

/*
 * [[다형성 (polymorphsim) ]]
 * 하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미한다.
 * 
 * instanceof 연산자
 * 	객체가 특정 클래스 상속 여부 boolean으로 반환.
 * 
 * 
 * 
 */
public class MainClass01 {
		public static void main(String[] args) {
			AkWeapon ak = new AkWeapon();
			ak.attack();
			ak.doSnip();
			
			Weapon m4a1 = new M4A1Weapon();
			m4a1.attack();
			
			M4A1Weapon m4Real = (M4A1Weapon) m4a1;
			m4Real.attack();
			m4Real.doSnip();
			
			//m4a1 m4Real 같을까요? 다를까요?   정답은 같다!!!!!
			System.out.println(System.identityHashCode(m4a1));
			System.out.println(System.identityHashCode(m4Real));
			System.out.println(System.identityHashCode(ak));
			
			//m4a1 m4Real같은데 왜? m4a1은 doSnip 안되는가? => 다형성때문에!
			
			
			M16 m16 = new M16();
			
			calssifyWeapon(m16);
			calssifyWeapon(m4a1);
			calssifyWeapon(m4Real);
			calssifyWeapon(ak);
			
		}
		
		//소총 구분하는 메소드
		public static void calssifyWeapon(Object weapon) { //Weapon weapon = m16
			
			if(weapon instanceof Scope) {
				System.out.println("저격소총 입니다.");
			} else {
				System.out.println("일반소총 입니다.");
				M16 m16 = (M16) weapon;
			}
		}
		
		
		
		
		
		
		
		
		
}
