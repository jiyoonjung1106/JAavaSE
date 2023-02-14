package day10.lang;

import day10.mypac.Car;

/*
 * [[java.lang 패키지]]
 * 기본 제공해주는 패키지
 * import도 필요없음!!
 * 
 * [[Object 클래스]]
 * 모든 클래스의 최상위 부모이다.
 * 즉 모든 클래스는 Object 클래스를 상속 받는다.
 * extends 생략!!
 * 
 * 		 equlas() 메소드 : 두 객체가 동일한 객체 true
 * 								  다르면  false
 * 		hashcode() 메소드 : 
 * 			객체의 메모리 번지를 이용, 해시코드를 만들어 리턴
 * 		toString() 메소드 : 
 * 			객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 * 
 * 		clone() : 새로운 객체로 복사(깊은 복사)	
 * 				  Cloneable 인터페이스 상속받는 객체 사용가능
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		if(car1.equals(car2)) {
			System.out.println("car1과 car2는 같습니다.");
		}else {
			System.out.println("car1과 car2는 다릅니다.");
		}
		System.out.println(System.identityHashCode(car1));
		System.out.println(System.identityHashCode(car2));
		System.out.println(car1.hashCode());
		System.out.println(car2.hashCode());
		
		// immutable 불변의 변수 기본형
		int num1 =10;
		int num2 = 10;
		int num3 = 11;
		System.out.println(System.identityHashCode(num1));
		System.out.println(System.identityHashCode(num2));
		System.out.println(System.identityHashCode(num3));
		num3 = 10;
		System.out.println(System.identityHashCode(num3));
		
		System.out.println(car1);	//toString() 생략
		System.out.println(car2);	//toString() 생략
		
		//toString() 메소드 : 클래스 정보 + "@" + 16진수로 변환 주소값
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		
		//toString() 오버라이딩 : 문자열 값이 나오게 재정의 했다.
		String str = "hello";
		System.out.println("str : "+ str);
		System.out.println("str : "+ str.toString());
		
		String str2 = new String("hello");
		System.out.println("str2 : "+ str2);
		System.out.println("str2 : "+ str2.toString());
		
		Car car3 = new Car("모델Y");
		System.out.println(car3);
		
		
		
	}

}




































