package day07.extendsEx;

import day07.mypac.Cat;
import day07.mypac.Persian;

/*
 * [[ 상속 ]]
 * 부모 클래스(상위 클래스)와 자식 클래스(하위 클래스)가 있으며,
 * 자식 클래스는 부모 클래스를 선택해서,
 * 그 부모의 멤버를 상속받아 그대로 쓸 수 있게 된다.
 * 
 * 클래스 1개당 상속 1개
 */
public class MainClass01 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		//고양이 이름지어주기
		cat.setName("프린세스");
		
		String catName = cat.getName();
		System.out.println(catName);
		
		Persian pCat = new Persian();
		
		pCat.getColor();
		pCat.setName("프린스");
		System.out.println(pCat.getName());
		
		//모든 클래스의 최상위 부모이다.
		Object obj = new Object();
		
	}
}
