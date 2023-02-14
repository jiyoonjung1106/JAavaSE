package day10.mypac;

public class Car {
	public String model;
	public String color;
	
	public Car() {
		this.model = "카니발";
	}
	
	public Car(String model) {		//오버로딩
		this.model = model;
	}
	
	public String toString() {
		
		return model;
		
	}
	

}
