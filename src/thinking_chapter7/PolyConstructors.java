package thinking_chapter7;

/**
 * 
 * 本程序说明
 * 调用顺序遇到多态时候一点问题：首先调用父类的构造方法是没问题的，在父类构造方法中会调用抽象的方法，而这个方法在子类中实现，此时
 * 会去调用子类的该具体实现方法，然后再返回，继续调用父类构造方法（如果还有调用没结束的话），完了之后才是子类
 * @author v_zhangwei13
 * Create on 2017年5月14日下午4:29:18
 */
public class PolyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

abstract class Glyph {
	abstract void draw();
	
	public Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {

	int radius = 1;
	public RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	@Override
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
	
}