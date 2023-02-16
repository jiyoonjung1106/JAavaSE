package day11.util;

import java.util.LinkedList;
import java.util.Queue;

/*
 * [[ Queue ]]
 * 	 - 배열성 인터페이스 
 * 	 - 선입선출(FIFO) : 먼저 들어온 값이 먼저 나간다.
 */
public class MainClass06 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("피카츄");
		queue.offer("라이츄");
		queue.offer("파치리스");
		
		LinkedList<String> list = (LinkedList<String>) queue;
		
		list.remove();
		
		System.out.println(list.get(0));
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		System.out.println(queue.size());
	}

}
