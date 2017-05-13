package thinking_chapter7.staticclass;

/**
 * 
 * 本程序展示静态内部类的使用
 * @author v_zhangwei13
 * Create on 2017年5月13日下午5:33:28
 */
public class Parcel9 {
	private static class PContents extends Contents {
		private int i = 11;
		@Override
		public int value() {
			System.out.println("i = " + i);
			return i;
		}
	}
	
	protected static class PDestination implements Destination {
		private String label;
		public PDestination(String whereTo) {
			label = whereTo;
		}
		@Override
		public String realLabel() {
			System.out.println("label = " + label);
			return label;
		}
	}
	
	public static class PTest {
		public static void printHello() {
			System.out.println("Hello");
		}
	}
	
	public static Destination dest(String s) {
		return new PDestination(s);
	}
	
	public static Contents con() {
		return new PContents();
	}
	
	public static void main(String[] args) {
		con().value();
		dest("Hefei").realLabel();
		new Parcel9.PContents().value(); //这种方式也能访问到内部类的value方法
		Parcel9.PTest.printHello(); // 这说明内部类是静态的，内部类的方法也是静态的，就可以直接访问
	}
}

abstract class Contents {
	public abstract int value();
}

interface Destination {
	String realLabel();
}