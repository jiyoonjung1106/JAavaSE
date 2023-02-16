package day11.util;

import java.nio.file.spi.FileSystemProvider;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 *[[ ArrayList Class ]]
 * - 선형배열 객체 
 * - 가변 배열이다.
 * - 인덱스 값이 있다.
 * 
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//데이터 저장하기
		list.add("피카츄");		//0
		list.add("라이츄");		//1
		list.add("파이리");		//2
		
		//저장된 데이터의 특정 인덱스 값 얻어오기
		String str = list.get(0);
		System.out.println("list 0 인덱스 값 : "+str);
		
		//저장된 데이터에서 특정 인덱스 내용 삭제하기
		list.remove(1);
		String str1 = list.get(1);
		System.out.println("list 0 인덱스 값 : "+str1);
		System.out.println("저장된 데이터의 개수 : "+list.size());
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("list["+i+"]"+list.get(i));
		}
		
		for(String name : list) {
			System.out.println("name : "+ name);
		}
		
		//★다형성을 이용하여 List 타입으로 ArrayList 객체 생성
		List<String> list2 = new ArrayList<>();
		// 깊은 복사
		List<String> list3 = (List<String>) list.clone();
		System.out.println("복제한 list 0인덱스 값 : "+list3.get(0));
		
		// ArrayList와 기능은 동일하다
		LinkedList<String> link = new LinkedList<>();
		link.add("잠만보");
		link.add("파치리스");
		
		for(String name : link) {
			System.out.println("linked name : "+name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}







