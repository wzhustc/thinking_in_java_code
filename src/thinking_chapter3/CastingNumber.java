package thinking_chapter3;

/**
 * 本程序说明：
 * 将float或者double类型的值转换为int或者char时，都是直接丢弃小数,只进行整数位的相加
 * 所以0.7/0.4转换为int型=0，而1.7/1.4转为int型=1
 * 0.7/0.4转为char型 +'a'还等于'a',1.7/1.4转为char型+'a' = 'b'
 * @author v_zhangwei13
 *
 */
public class CastingNumber {
	public static void main(String[] args) {
		double x1 = 0.7;
		double x2 = 0.4;
		
		double y1 = 1.7;
		double y2 = 1.4;
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("y1 = " + y1);
		System.out.println("y2 = " + y2);
		
		System.out.println("(int)x1 = " + (int)x1);
		System.out.println("(int)x2 = " + (int)x2);
		System.out.println("(int)y1 = " + (int)y1);
		System.out.println("(int)y2 = " + (int)y2);   
		
		System.out.println("(char)x1 = " + (char)('a' + x1));
		System.out.println("(char)x2 = " + (char)('a' + x2));
		System.out.println("(char)y1 = " + (char)('a' + y1));
		System.out.println("(char)y2 = " + (char)('a' + y2));
	}
}
