package thinking_chapter6;

public class SprinkerSystem {
	private String value1, value2, value3, value4;
	
	WaterSource ws;
	int i;
	float f;
	void print() {
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		System.out.println("value3 = " + value3);
		System.out.println("value4 = " + value4);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("source = " + ws);
	}
	
	public static void main(String[] args) {
		SprinkerSystem x = new SprinkerSystem();
		x.print();
		new WaterSource().toString();
	}
}

class WaterSource {
	private String s;
	
	public WaterSource() {
		System.out.println("constructor() has been invoked");
		s = new String("Constructed");
	}
	
	@Override
	public String toString() {
		System.out.println(s);
		return s;
	}
	
}
