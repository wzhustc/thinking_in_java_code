package thinking_chapter4;

/**
 * 
 * 本程序说明对基本类型来说：
 * 如果由小类型转为大类型的时候(比如short-->int型)，默认是允许的，且会默认调用大类型的方法
 * 但如果由大类型转为小类型时候(比如int-->short型)，默认是不允许的，且编译会报错，
 * 除非你指定转换为某类型，造成的后果是丢失精度
 * @author v_zhangwei13
 * Create on 2017年5月1日下午3:36:54
 */
public class PrimitiveOverloading {
	public static void print(String s) {
		System.out.println(s);
	}
	
	void f1(char x) { print("f1(char)"); }
	void f1(byte x) { print("f1(byte)"); }
	void f1(short x) { print("f1(short)"); }
	void f1(int x) { print("f1(int)"); }
	void f1(long x) { print("f1(long)"); }
	void f1(float x) { print("f1(float)"); }
	void f1(double x) { print("f1(double)"); }
	
	void f2(byte x) { print("f2(byte)"); }
	void f2(short x) { print("f2(short)"); }
	void f2(int x) { print("f2(int)"); }
	void f2(long x) { print("f2(long)"); }
	void f2(float x) { print("f2(float)"); }
	void f2(double x) { print("f2(double)"); }
	
	void f3(short x) { print("f3(short)"); }
	void f3(int x) { print("f3(int)"); }
	void f3(long x) { print("f3(long)"); }
	void f3(float x) { print("f3(float)"); }
	void f3(double x) { print("f3(double)"); }
	
	void f4(int x) { print("f4(int)"); }
	void f4(long x) { print("f4(long)"); }
	void f4(float x) { print("f4(float)"); }
	void f4(double x) { print("f4(double)"); }
	
	void f5(long x) { print("f5(long)"); }
	void f5(float x) { print("f5(float)"); }
	void f5(double x) { print("f5(double)"); }
	
	void f6(float x) { print("f6(float)"); }
	void f6(double x) { print("f6(double)"); }
	
	void f7(double x) { print("f7(double)"); }
	
	
	void testConstVal() {
		print("test with 5");
		f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
	}
	
	void testChar() {
		char x = 'x';
		print("char argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testByte() {
		byte x = 0;
		print("byte argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testShort() {
		short x = 0;
		print("short argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testInt() {
		int x = 0;
		print("int argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testLong() {
		long x = 0;
		print("long argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testFloat() {
		float x = 0;
		print("float argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	void testDouble() {
		double x = 0;
		print("double argument : ");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
	}
	
	public static void main(String[] args) {
		PrimitiveOverloading p = new PrimitiveOverloading();
		p.testConstVal();
		p.testChar();
		p.testByte();
		p.testShort();
		p.testInt();
		p.testLong();
		p.testFloat();
		p.testDouble();
	}
	
}
