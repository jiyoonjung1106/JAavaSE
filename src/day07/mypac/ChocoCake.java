package day07.mypac;

public class ChocoCake extends Cake {

	public ChocoCake() {
		super();  //자식클래스에서 부모생성자 호출
		super.cakeName ="초코케이크";
		super.cakePrice = 19000;
	}
}
