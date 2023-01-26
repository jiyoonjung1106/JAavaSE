package day03.conditional;

public class MainClass02 {
	static String result;		//전역변수
	public static void main(String[] args) {
		int score = 75;
		String result = null;	//지역변수
		if(score >=90) {
			result = "수";
		} else if(score >=80) {
			result = "우";
		} else if (score >=70) {
			result = "미";
		} else if (score >=60) {
			result = "양";
		} else {
			result = "가";
		}
		
		System.out.println("성적 : " + result);
	}

}
