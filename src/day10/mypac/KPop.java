package day10.mypac;

public class KPop implements Cloneable {
	public String musicName;
	public String singer;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Object callClone() throws CloneNotSupportedException {
		return clone();
	}

}
