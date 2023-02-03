package day06.mypac;

public class HandPhone {
	public String model; 		//전역변수 초기화 하지 않음 null
	
	static {
		System.out.println("static  초기화 블럭");
	}
	
	{
		System.out.println("초기화블럭");
	}
	
//	//생성자
//	public HandPhone() {
//		this.model = "갤럭시";
//		System.out.println("생성자가 호출 되었습니다.");
//	}
	
	//오버로딩 생성자
	public HandPhone(String model) {
			this.model = model;
			System.out.println("오버로딩 생성자가 호출 되었습니다.");
	}

}
