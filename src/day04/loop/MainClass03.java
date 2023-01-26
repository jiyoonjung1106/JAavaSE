package day04.loop;
/*
 * 3. for문
 * 
 * for(초기화변수; 조건식; 증감식) {
 * 		반복 수행할 코드
 * }
 */
public class MainClass03 {
	public static void main(String[] args) {
		// 0~9까지 for문을 이용해 출력하기
//실행순서	//1(처음한번)	2	 4
		for(int i = 0; i<10; i++) {
			System.out.println(i);	//3
		}
		
		int i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
	}
}
