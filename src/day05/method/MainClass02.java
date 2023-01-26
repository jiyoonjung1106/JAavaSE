package day05.method;

public class MainClass02 {
		public static String name; 		//전역변수 name 선언
	
		public static void main(String[] args) {
			
			setName("잠만보");		//set메소드를 통해 전역변수에 값 대입
			String name = getName();		//get메소드를 통해 전역변수 값 불러오기
			System.out.println(name);
			
			int sum = sum(1,2,3);
			System.out.println("합계 : " + sum);
		}
		
		// 인자 X 리턴 O
		public static String getName() {
			return name;
		}
		
		public static void setName(String name) {
			MainClass02.name = name;
		}
		
		// 인자 O 리턴 O
		public static int sum(int a, int b, int c) {
			return a + b+ c;
		}
}
