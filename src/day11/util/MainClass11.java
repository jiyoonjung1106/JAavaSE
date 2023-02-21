package day11.util;

import java.nio.file.spi.FileSystemProvider;
import java.util.Random;

/*
 * [[Random Class ]]
 *  - 난수 생성 클래스
 * 
 */
public class MainClass11 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 0~9 사이 정수 중 난수 발생
		int ranNum = ran.nextInt(10);
		System.out.println("난수 : "+ranNum);
		
		
		
		
	}

}
