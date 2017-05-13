package thinking_chapter7.innerclass;

/**
 * 
 * 本程序展示了如何使用内部类，如何new一个内部类。
 * 如果生成一个static内部类，就不需要指向外部类对象的一个句柄
 * @author v_zhangwei13
 * Create on 2017年5月13日下午5:43:02
 */
public class Parcel10 {
	class Contents {
		private int i = 12;
		public int value() {
			System.out.println("i = " + i);
			return i;
		}
	}
	
	class Destination {
		private String label;
		
		public Destination(String whereTo) {
			label = whereTo;
		}
		
		public String realLabel() {
			System.out.println("label = " + label);
			return label;
		}
	}
	
	public static void main(String[] args) {
		Contents c = new Parcel10().new Contents();
		c.value();
		
		Destination d = new Parcel10().new Destination("Hefei");
		d.realLabel();
	}
	
}
