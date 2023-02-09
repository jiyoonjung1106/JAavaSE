package day09.mypac;

public class Soldier {
	
	public Weapon w;
	
	public Soldier(Weapon w) {
		this.w = w;
		w.attack();
	}

}
