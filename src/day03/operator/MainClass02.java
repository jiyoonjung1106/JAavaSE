package day03.operator;
/*
 * 2. 증감 연산자
 * 
 * ++ : 1씩 증가시킨다.
 * -- : 1씩 감소시킨다.
 */
public class MainClass02 {
		public static void main(String[] args) {
			int num = 0;
			num = num +1;
			System.out.println(num);			//1
			num++;
			System.out.println(num);			//2
			
			System.out.println(++num);			//3
			
			System.out.println(num++);			//3	
			System.out.println(num++);			//4
			
			//0~99까지 출력하는 반복문(for)
			for(int i = 0; i<100; i++) {
				System.out.println(i);
			}
			int num2 = 0;
			num2 = num2 - 1;
			System.out.println(num2);
			num2--;
			System.out.println(num2);
		}
}
