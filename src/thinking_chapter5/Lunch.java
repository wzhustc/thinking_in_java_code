package thinking_chapter5;

/**
 * 
 * 本程序说明
 * 1、类构造方法如果为私有，那么外部类无法生成其对象
 * 2、虽然外面的类无法在外面new soup类，但soup类可以先在内部new出来，供外界调用，所以外界不能new，但是能invoke。
 * @author v_zhangwei13
 * Create on 2017年5月4日下午8:29:32
 */
public class Lunch {
	public static void main(String[] args) {
//		Soup priv1 = new Soup(); // error 因为Soup的构造是私有的。
		Soup priv2 = Soup.makeSoup();
		Sandwich f1 = new Sandwich();
		Soup.access().f();
	}
}

class Sandwich {
	void f() {
		new Lunch();
	}
}

class Soup {
	private Soup() {
		System.out.println("soup constructor invoked");
	}
	
	public static Soup makeSoup() {
		return new Soup();
	}
	
	private static Soup ps1 = new Soup();
	
	public static Soup access() {
		return ps1;
	}
	
	public void f() {
		
	}
}
