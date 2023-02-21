package day11.util;

import java.util.Scanner;

/*
 * [[Scanner ]]
 *  - 입력 객체
 *  
 */
public class MainClass10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 >>>");
		
		String str = scan.next();
		
		System.out.println("입력 받은 값 : "+str);
	}

}
