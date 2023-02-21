package day11.util;

import java.text.ParseException;

import day11.mypac.DateUtils;

/*
 * 날짜 객체 예제
 */
public class MainClass09 {
	public static DateUtils dateUtils = new DateUtils();
	
	public static void main(String[] args) throws ParseException {
		
		
		String strDate = dateUtils.getDate();
		System.out.println("현재 날짜 : "+ strDate);
		
		
		String strDateAndDay = dateUtils.getDateAndDay();
		System.out.println("현재 날짜 : "+ strDateAndDay);
		
		
		
		String strCalc = dateUtils.dateCalc("2023.02.27", "yyyy.MM.dd", +1, 0, 0, 0, 0, 0);
		System.out.println("원하는 날짜 계산결과 : " + strCalc);
		
		
		
		}
		
		
		
		
		
		

	}

	
	
	

