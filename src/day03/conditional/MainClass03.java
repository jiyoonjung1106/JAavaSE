package day03.conditional;
/*
 * switch ~ case문 (if문이랑 비슷)
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		int num = 11;
		switch(num) {
		case 0 : 
			System.out.println("0입니다.");
			break;
		case 1 : 
			System.out.println("1입니다.");
			break;
		case 2 : 
			System.out.println("2입니다.");
			break;
		case 3 : 
			System.out.println("3입니다.");
			break;
		default : 
			System.out.println("0~3이 아닙니다.");
			break;
		}
	}

}
