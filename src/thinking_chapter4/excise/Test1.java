package thinking_chapter4.excise;

import java.util.Random;

public class Test1 {
	Test1() {
		System.out.println("Test1的默认构造方法被调用生成一个对象");
	}
	
	Test1(String s) {
		System.out.println("这是一个带有参数为：\" " + s + " \"字符串的构造方法");
	}
	public static void main(String[] args) {
		new Test1();
		new Test1("zhangwei is a good coder");
		
		Test1[] t1 = new Test1[10];
		for (int i = 0; i < t1.length; i++) {
			t1[i] = new Test1();
			System.out.println("t1[" + i + "] = " + t1[i].toString());
		}
	}
}
