package thinking_chapter3;

/**
 * 这个程序说明的是对于一个类的类成员（全局变量）来说，其只有一份
 * 所以，如果改变的话前后是都会改变的。
 * @author v_zhangwei13
 *
 */
public class PassObject {
	
	public static void change(Letter letter) {
		letter.c = 'A';
	}
	
	public static void main(String[] args) {
		Letter let = new Letter();
		let.c = 'a';
		System.out.println("before change let == " + let.c);
		
		change(let);
		
		System.out.println("after change ler == " + let.c);
	}
}

class Letter {
	char c;
}
