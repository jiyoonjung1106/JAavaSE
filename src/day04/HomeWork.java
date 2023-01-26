package day04;

public class HomeWork {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			// 상단 공백
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			// 상단 *
			for (int j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");
			}
			System.out.println();
		} //for

		for (int i = 2; i >= 1; i--) {
			// 하단 공백
			for (int j = 1; j <= 3 - i; j++) {
				System.out.print(" ");
			}
            
			// 하단 *
			for (int j = 1; j <= i * 2 - 1; j++) {

				System.out.print("*");
			}

			System.out.println();
		} //for

}
}
