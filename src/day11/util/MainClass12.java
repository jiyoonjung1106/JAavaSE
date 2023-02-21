package day11.util;

import java.util.Random;

public class MainClass12 {
		public static void main(String[] args) {
			// 정수를 저장할 수 있는 45 크기 배열생성
			int [] lNum = new int[45];
			
			// 반복문으로 배열에 1~45 저장
			for(int i =0; i<lNum.length; i++) {
				lNum[i] = i+1;
				
			}
			// 난수 객체 생성
			Random ran = new Random();
			
			// 셔플 - 반복문 돌면서 순서 섞기
			for (int i = 0; i < lNum.length; i++) {
				// 0~44 사이 정수값 얻어오기
				int changeIndex = ran.nextInt(45);
				
				//바꿔야할 인덱스 값과 현재 인덱스의 값 자리 바꾸기(tmp는 임시 변수-> 둘끼리 바꾸면 값이 사라지기 때문)
				int tmp = lNum[i];
				lNum [i] = lNum[changeIndex];
				lNum[changeIndex] = tmp;
			}
			for(int i =0; i<6; i++) {
				System.out.print(lNum[i]+ " / ");
			}
			
			
			
		}
}
