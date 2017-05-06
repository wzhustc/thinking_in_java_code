package thinking_chapter6;

/**
 * 
 * 本程序说明:
 * 构造方法在构造的时候可以初始化基本类型、对象等
 * @author v_zhangwei13
 * Create on 2017年5月6日下午3:13:00
 */
public class Bath {
	private String s1 = new String("Happy");
	private String s2 = "Happy";
	private String s3, s4;
	Soap soap;
	int i;
	float f;
	
	public Bath() {
		System.out.println("Inside Bath()");
		s3 = new String("Joy");
		i = 3;
		f = 3.14f;
		soap = new Soap();
	}
	
	void print() {
		if (s4 == null) {
			s4 = new String("new s4");
		}
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);
		System.out.println("i = " + i);
		System.out.println("float = " + f);
		System.out.println("soap = " + soap);
	}
	
	public static void main(String[] args) {
		Bath bath = new Bath();
		bath.print();
	}
}

class Soap {
	private String s;
	Soap() {
		System.out.println("Soap()");
		s = new String("Constructor() soap");
	}
	
	@Override
	public String toString() {
		return s;
	}
}
