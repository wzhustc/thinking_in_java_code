package thinking_chapter6;

/**
 * 
 * 本程序说明继承时创建对象的顺序
 * 最先创建的是爷爷，没有爷爷就没有爸爸，更没有你
 * 其次创建的是爸爸，没有爸爸也没你
 * 最后才是创建你自己
 * @author v_zhangwei13
 * Create on 2017年5月6日下午3:39:09
 */
public class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon constructor() is invoked");
	}
	
	public static void main(String[] args) {
		new Cartoon();
	}
}

class Drawing extends Art {
	public Drawing() {
		System.out.println("Drawing constructor() is invoked");
	}
}

class Art {
	public Art() {
		System.out.println("Art constructor() is invoked");
	}
}