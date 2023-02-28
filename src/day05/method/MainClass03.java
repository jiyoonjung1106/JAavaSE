package day05.method;

public class MainClass03 {
		public static void main(String[] args) {
			
			System.out.println(fibonacci(3));
			
		}
		public static int fibonacci(int n) {		//3
			if(n <=1) {
				return n;
			}
			return fibonacci(n-1)//2 | 1
					+ fibonacci(n-2); //
		}
}
