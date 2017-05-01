package thinking_chapter2;

/**
 * 程序用于查看各基本类型的默认值
 * @author v_zhangwei13
 *
 */
public class DefaultValue {
	public static boolean bool;
	public static char c;
	public static byte b;
	public static short sh;
	public static int i;
	public static long l;
	public static float f;
	public static double d;
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	public static void main(String[] args) {
		
		System.out.println(bool);
		System.out.println(c);
		System.out.println(b);
		System.out.println(sh);
//		i++;
		// i++打出来值为0，++i打出来值为1，所以判断 i++是【先使用】i【再自加】，但是++i是【先自加】，【再使用】
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println("-------------------");
		
		System.out.println(DefaultValue.add(3, 5));
		System.out.println(new DefaultValue().minus(3, 5));
	}
	
}
