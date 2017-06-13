package thinking_chapter11;

/**
 * 
 * 本程序在Class.forName("thinking_chapter11.Cookie")语句处有坑
 * 如果不写包名，是会报ClassNotFoundException的，只有写全了才不报错
 * @author v_zhangwei13
 * Create on 2017年6月11日下午12:01:25
 */
public class SweetShop {
	public static void main(String[] args) {
		System.out.println("inside main");
		
		new Candy();
		
		System.out.println("After new Candy...");
		
		try {
			Class.forName("thinking_chapter11.Cookie");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("After new Cookie");
		
		new Gum();
		
		System.out.println("After new Gum");
	}
	
}

class Candy {
	static {
		System.out.println("Loading Candy");
	}
}

class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}

class Gum {
	static {
		System.out.println("Loading Gum");
	}
}