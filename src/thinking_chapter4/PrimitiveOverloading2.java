package thinking_chapter4;

/**
 * 
 * 本程序接着PrimitiveOverloading说明当一个大精度的值转换为小精度的值时
 * 必须要指出你转换为的具体类型，否则编译报错。
 * @author v_zhangwei13
 * Create on 2017年5月1日下午3:49:43
 */
public class PrimitiveOverloading2 {
	void f1(short x) {
		System.out.println("f1(short参数)被调用" + x);
	}
	
	void f1(int x) {
		System.out.println("f1(int参数)被调用");
	}
	
	void f1(float x) {
		System.out.println("f1(float参数)被调用" + x);
	}
	
	public static void main(String[] args) {
		PrimitiveOverloading2 p = new PrimitiveOverloading2();
		p.f1((int)33L); // 如果这里不对Long型的值强制转换为int型，编译会出错。
		p.f1((short)33);
		p.f1((float)33.33333333D);
	}
}
