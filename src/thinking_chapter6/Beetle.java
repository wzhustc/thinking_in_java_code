package thinking_chapter6;

/**
 * 
 * 本程序说明
 * 程序初始化时，首先初始化父类，再是子类。因为子类依赖父类
 * @author v_zhangwei13
 * Create on 2017年5月7日上午11:00:28
 */
public class Beetle extends Insect {
	int k = prt("Beetle.k initialized");
	Beetle() {
		prt("k = " + k);
		prt("j = " + j);
	}
	
	static int x2 = prt("static Beetle.x2 initialized");
	static int prt(String s) {
		System.out.println(s);
		return 63;
	}
	public static void main(String[] args) {
		prt("Beetle constructor");
		new Beetle();
	}
}

class Insect {
	int i = 0;
	int j;
	Insect() {
		prt("i = " + i + ", j = " + j);
		j = 39;
	}
	
	static int x1 = prt("static Insect.x1 initialized");
			
	static int prt(String s) {
		System.out.println(s);
		return 47;
	}
}