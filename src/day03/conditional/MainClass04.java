package day03.conditional;

public class MainClass04 {
	public static void main(String[] args) {
		char ch = 'w';
		switch (ch) {
		case 'w':
			System.err.println("앞으로 이동");
			break;
		case 'a':
			System.err.println("좌측으로 이동");
			break;
		case 's':
			System.err.println("뒤로 이동");
			break;
		case 'd':
			System.err.println("우측으로 이동");
			break;

		default:
			System.out.println("공격!!!!!!");
			break;
		}
	}
}
