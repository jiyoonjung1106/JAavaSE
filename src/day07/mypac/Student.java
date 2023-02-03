package day07.mypac;

public class Student extends People {
	
	public int korScore;
	public int mathScore;
	public int engScore;
	
	
	
	//생성자 - 리턴값이 없다.
	//		  객체 생성전 한번만 실행된다.
	public Student(String name, int age, int korScore, int mathScore, int engScore) {
		super.name = name;
		super.age = age;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
		
	}
	public void printMyScore() {
		System.out.println("국어점수 : " + korScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("영어점수 : " + engScore);
	}

}
