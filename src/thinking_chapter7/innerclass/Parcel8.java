package thinking_chapter7.innerclass;

/**
 * 
 * 本程序展示了对匿名内部类的一个对象进行初始化，可以通过定义自己字段进行初始化
 * 若试图定义一个匿名内部类，并想使用在匿名内部类外部定义的一个对象，则编译器要求外部对象为final属性
 * @author v_zhangwei13
 * Create on 2017年5月13日下午3:31:04
 */
public class Parcel8 {
	public Destination dest(final String dest) {
		return new Destination() {
			private String label = dest;
			public String realLabel() {
				return label;
			}
		};
	}
	
	public static void main(String[] args) {
		Parcel8 p8 = new Parcel8();
		Destination ds = p8.dest("Hefei");
		String label = ds.realLabel();
		System.out.println(label);
	}
}
