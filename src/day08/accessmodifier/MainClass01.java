package day08.accessmodifier;

import day08.mypac.CellPhone;
import day08.mypac.Phone;
import day08.mypac2.SmartPhone;

/*
 * [[ 접근제어자/접근제한자 ]]
 * 		public - 모든 클래스에서 접근 가능
 * 		protected - 같은 패키지 또는 상속 관계에서 접근가능
 * 		default - 같은 패키지 접근 가능
 * 		private - 같은 클래스 안에서 접근 가능
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CellPhone cellPhone = new CellPhone();
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("모델명 : "+ phone.model);
		System.out.println("모델명 : "+ cellPhone.model);
		System.out.println("모델명 : "+ smartPhone.getModel());
		
		smartPhone.videoMessage();
		
	}

}
