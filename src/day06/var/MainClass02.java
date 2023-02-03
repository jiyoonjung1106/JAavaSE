package day06.var;

public class MainClass02 {
	// 기본형/전역변수
	public static int num2 = 20;
	public static int num3;	//default  값 0
	public static double dNum;
	public static String str;
	public static boolean isBool;
	
	public static void main(String[] args) {
			//기본형/ 지역변수
			int num = 10;
			
			System.out.println(num);
			
			System.out.println(num2);
			
			int result = sum(num);			//int pNum = num;
			System.out.println(result);
			
			//초기화 하지 않은 전역변수 출력
			System.out.println(num3);
			
			int num4;
			//초기화 하지 않은 지역변수 사용불가(컴파일 에러)
			//System.out.println(num4);
			
			System.out.println(dNum);
			System.out.println(str);
			System.out.println(isBool);
	}
	
	 public static int sum(int pnum) {
		 
		 return pnum + num2;
	 }

}
