package day11.util;

import java.util.Stack;

/*
 * [[ Stack Class ]]
 * 	- 배열성 클래스
 * 	- 선입후출(FILO) : 먼저 들어온 값이 마지막에 나간다.
 * 
 * Generic(제네릭)
 * 1. 잘못된 타입 들어오는 것 방지
 * 2. 변환(cast) 필요없다.
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		// 생성한 객체에 자료 저장하기
		stack.push("피카츄");
		stack.push("라이츄");
		stack.push("파치리스");
		
		// 현재 저장하고 있는 데이터 개수
		System.out.println("데이터 개수 : "+ stack.size());
		
		//데이터를 하나씩 빼오기
//		System.out.println("1번  : "+ stack.pop());
//		System.out.println("2번 :"+ stack.pop());
//		System.out.println("3번 :"+stack.pop());
		
		System.out.println("가장위에 있는 데이터: "+stack.peek());
		
		while(!stack.empty()) {
			String name = stack.pop();
			System.out.println("pop한 데이터"+name);
		}
	}
}










