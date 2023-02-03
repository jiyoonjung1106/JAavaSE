package day07.mypac;
/*
 * overloading 과 override 차이점 면접에서 많이 물어봄
 */
public class Man extends Human{
	

	@Override
	public void useFire() {
		System.out.println("고기를 구워요!");
	}
	
	@Override
	public void say() {
		System.out.println("굵은 목소리로 ");
		super.say();
	}
		
}
