package day08.exception;

import java.util.Random;

public class MainClass03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int num = 10;
		try {
			System.out.println("DB를 연결합니다.");
			System.out.println(ran.nextInt()/num);	// throw new ArithmeticException
		} catch (Exception e) {	//Exception e = new	 ArithmeticException();
			System.out.println("예외가 발생하였습니다.");
		} finally {// 반드시 실행이 보장되는 블럭
		System.out.println("DB 연결 해제합니다.");
	}
	}
}
