package thinking_chapter6;

/**
 * 
 * 本程序说明在父类中重载的方法，在子类中仍然适用。
 * @author v_zhangwei13
 * Create on 2017年5月6日下午8:13:04
 */
public class Hide {

	public static void main(String[] args) {
		new Bart().print(22);
		new Bart().print("Hello World");
	}
}

class Homer {
	public void print(String s) {
		System.out.println("打印字符串 " + s + " 的方法");
	}
	
	public void print(int i) {
		System.out.println("打印整数 ：" + i + " 的方法");
	}
}

class Bart extends Homer {
	
}
