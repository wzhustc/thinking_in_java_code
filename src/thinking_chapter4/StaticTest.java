package thinking_chapter4;

/**
 * 
 * 本程序说明：将程序中1,2,3,4,5
 * @author v_zhangwei13
 * Create on 2017年5月1日下午5:53:24
 */
public class StaticTest {
	public static void staticMethod() {
		//1、 静态方法不能访问非静态方法
//		nullStaticMethod();
		System.out.println("这是一个静态方法");
	}
	
	public void nullStaticMethod() {
		//2、 非静态方法能访问静态方法
		staticMethod();
		System.out.println("这是一个非静态方法");
	}

	public void nullStaticMethod2() {
		//3、 非静态方法能访问非静态方法
		nullStaticMethod();
	}
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
		//4、 静态方法能访问静态方法
		staticMethod();
		//5、 静态方法可以通过对象.的方式访问非静态方法
		st.nullStaticMethod();
		st.nullStaticMethod2();
	}
	
}
