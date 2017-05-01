package thinking_chapter3;

/**
 * 
 * 本程序说明switch的用法，其中
 * 1、switch()括号中可以是整数和字符，后来衍生出可以是String字符串和Enum枚举
 * 2、case后面格式是':'，如果没有什么要执行，那就break跳出case，到程序末尾。
 * 3、如果需要继续往下执行，不用break.
 * 4、default位置不一定要在最后，可以夹在case的中间，此时，break的有无很关键。
 * 5、case后面加不加大括号都是可以的。
 * @author v_zhangwei13
 * Create on 2017年4月30日下午4:23:14
 */
public class SwitchTest {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			// random方法生成一个随机的0<x<1的数，*26后，生成的是一个介于1到26之间的数
			// 再加上一个偏移量a，向下转型成char后就是从a到z之间的一个字符了。
			char ch = (char)((Math.random() * 26) + 'a');
			System.out.println("c = " + ch);
			
			switch(ch) {
			case 'a':
			case 'i':
			case 'o':
			case 'u':
			case 'e':
				System.out.println("活捉到一个元音字母！！" + ch);
				break;
			
			case 'y':
			case 'w':
				System.out.println("活捉到有时候是元音的字母！！" + ch);
				break;
				
			default:
				System.out.println("此为辅音字母！！" + ch);
			}
		}
	}
}
