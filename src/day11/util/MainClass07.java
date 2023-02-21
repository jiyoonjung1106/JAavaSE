package day11.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * [[Date Class]
 * - 날짜 관련 객체
 */
public class MainClass07 {

	public static void main(String[] args) throws ParseException {
		// 날짜 객체 생성
		 Date date = new Date();
		 
		 System.out.println(date);
		 
		 // 날짜 포맷 변경해주는 객체
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		 
		 // Tue Feb 21 19:15:05 KST 2023 -> 2023.02.21 19:15:05
		 String strDate = sdf.format(date);
		 
		 System.out.println(strDate);
		 
		 String yesterday = "2023.02.20 19:10:46";
		 
		 //문자열 날짜 정보 Date 객체로 반환
		 Date yDate = sdf.parse(yesterday);
		 System.out.println("yDate : "+ yDate);
		 

	}

}
