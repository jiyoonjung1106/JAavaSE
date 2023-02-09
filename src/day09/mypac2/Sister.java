package day09.mypac2;

public class Sister extends Thread {
	public Wallet wallet;	//지갑 객체
	public int money;
	
	public Sister(Wallet wallet) {
		this.wallet = wallet;
	}
	
	@Override
	public void run() {
		while(true) {
			//지갑에서 돈을 인출해서 저장한다.
			int returnedMoney = wallet.getMoney();
			if(returnedMoney ==0) //지갑잔고가 0이면
				break;
			
			money = money + returnedMoney;
		}
		System.out.println("Sister 총 재산 : " + money);
	}
	
	
}
