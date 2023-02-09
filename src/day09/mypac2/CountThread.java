package day09.mypac2;

public class CountThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("메인스레드가 종료됩니다.");

	}

}
