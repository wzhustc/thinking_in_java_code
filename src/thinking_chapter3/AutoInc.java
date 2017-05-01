package thinking_chapter3;

/**
 * 本程序验证了++i和i++之间的区别
 * i++是先使用i，在对i进行++操作
 * ++i是先加i，i加完后，再使用i
 * @author v_zhangwei13
 *
 */
public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		
		print("i = " + i);  // i = 1
		print("++i = " + ++i); // ++i = 2  
		print("i++ = " + i++); // i++ = 2
		
		print("i = " + i); // i = 3
		print("--i = " + --i); // --i = 2
		print("i-- = " + i--); // i-- = 2
		
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
}
