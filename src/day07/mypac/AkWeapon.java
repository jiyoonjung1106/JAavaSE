package day07.mypac;

public class AkWeapon implements Weapon, Scope {
	
	@Override
	public void attack() {
		System.out.println("80데미지 공격해요!");
	}

	@Override
	public void doSnip() {
		System.out.println("1000 거리 저격 공격해요!");
	}

}
