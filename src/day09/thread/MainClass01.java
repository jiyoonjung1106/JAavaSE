package day09.thread;

import day09.mypac2.MyThread;

/*
 * [[ Thread ]]
 * 	스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 * 	하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위를 말한다.
 * 	병렬 프로그래밍
 * 	비동기 프로그래밍
 *	
 *	[[새로운 스레드를 시작시키는 방법 ]]
 *	1. Thread 객체를 생성할 수 있는 클래스 정의
 *	2. 정의한 클래스를 이용해서 객체 생성
 *	3. 생성된 객체의 start() 메소드를 호출한다.
 *		!주의 run() 메소드 호출 아님!!
 */
public class MainClass01 {
	public static void main(String[] args) throws InterruptedException {
			System.out.println("메인 스레드 시작");

			MyThread thread1 = new MyThread();
			thread1.start();
			
			Thread.sleep(500);
			System.out.println("메인 스레드가 종료됩니다.");
	}

}
