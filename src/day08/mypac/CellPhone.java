package day08.mypac;

public class CellPhone extends Phone {
	public String model;
	
	public CellPhone() {
		this.model = "휴대용 전화기";
	}
	
	protected void sendMessage() {
		System.out.println("문자 보내기.");
	}

}
