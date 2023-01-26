package day05.method;
/*
 * [[메소드(method)]]
 * 	어떤 특정 작업을 수행하기 위한 명령문의 집합.
 * 
 * (접근제어자) (정적) 반환타입 메소드이름(매개변수타입 매개변수명) {		//선언부
 * 		실행할 코드(명령문)		//구현부
 *		
 *		return 반환값;		 //void일때 생략가능 
 * 
 * }
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
			// hello 메소드 호출하기
			hello();
	}
	
	 public static void hello() {
		 System.out.println("Hello, World");
	 }

}
