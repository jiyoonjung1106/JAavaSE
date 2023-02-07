package day07.mypac;

public class Creambread extends Bread {
	public Creambread() {
		super();  //자식클래스에서 부모생성자 호출
		super.breadName ="크림빵";
		super.breadPrice = 2000;
	}

}
