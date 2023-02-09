package day09.innerclass;
/*
 * [[내부 클래스 (InnerClass) ]]
 * 클래스 안에 또 다른 클래스 정의
 * 클래스에 다른 클래스를 선언하는 이유는 두 클래스간 긴밀한 관계 때문이다.
 * 
 * 
 */
public class MainClass01 {
		public static void main(String[] args) {
			new MainClass01.InnerClass().doSomething();
			new InnerClass().doSomething();
			
		}// main메소드 End
		
		static class InnerClass {
			public void doSomething() {
				System.out.println("무언가를 해요!");
			}
		} // InnerClass End
}	// MainClass01
