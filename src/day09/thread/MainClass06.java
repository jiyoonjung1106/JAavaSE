package day09.thread;

public class MainClass06 {
	public static void main(String[] args) {
		new Thread(new Runnable() {		//익명클래스
			@Override
			public void run() {
				System.out.println("스레드가 시작되었습니다.");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}).start();
		System.out.println("메인스레드가 종료됩니다.");
	}

}
