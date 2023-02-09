package day09.innerclass;

import day09.mypac.Soldier;
import day09.mypac.Weapon;

public class MainClass04 {
	
	public static void main(String[] args) {
		
		Soldier s = new Soldier(new Weapon() {

			@Override
			public void attack() {
				System.out.println("솔져 공격!!!");
			}
			
		});
		
		s.w.attack();
		
		Ak47 ak47 = new Ak47();
		
		Soldier s2 = new Soldier(ak47);
		s2.w.attack();
		
	}

}

class Ak47 implements Weapon {

	@Override
	public void attack() {
		System.out.println("AK47 소총공격!!");
		
	}
	
}