package day08.exception;

import day08.mypac.NumberPrinter;
/*
 * throws - 예외가 발생하면 상위메소드로 예외를 던진다.
 * 
 * 
 * 
 */



public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter np = new NumberPrinter();
//		try {
//			np.printNumber();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		np.printNumber();
		
		
		// 강제로 익셉션 발생시키기
		throw new NullPointerException();
		
	}
}
