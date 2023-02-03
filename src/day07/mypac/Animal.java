package day07.mypac;

public class Animal {
	
	String name;
	
	//set 메소드 - 값 설정하기
	//이름 지어주기
	public void setName(String name) {
		this.name = name;
	}
	//get 메소드 - 값 불러오기
	public String getName() {
		return name;
	}
	
	//움직인다.
	public void move() {
		System.out.println("움직인다.");
	}
}
