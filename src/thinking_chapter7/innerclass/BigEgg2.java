package thinking_chapter7.innerclass;

/**
 * 
 * 本程序说明显示地继承内部类是，内部类的方法被复写，在子类的内部类中调用的是子类的复写后的方法。
 * @author v_zhangwei13
 * Create on 2017年5月13日下午6:27:28
 * result:
 * Egg2.Yolk()
 * Egg2()
 * Egg2.Yolk()
 * BigEgg2.Yolk()
 * BigEgg2.Yolk().func()
 * 执行过程：先找父类Egg2，准备构造Egg2，发现还有内部类，那先构造内部类吧，构造完毕。
 * 再构造父类Egg2，父类构造好。现在构造子类，子类中有内部类，再构造内部类，发现有继承关系，再次构造内部类的父类Egg2.Yolk
 * 构造完内部类的父类，轮到内部类子类Yolk,内部类子类构造完，轮到子类了。最后main中调用gFunc()
 */
public class BigEgg2 extends Egg2 {
	// BigEgg2.Yolk明确地扩展了Egg2.Yolk，而且覆盖了它的方法
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			System.out.println("BigEgg2.Yolk()");
		}
		
		public void func() {
			System.out.println("BigEgg2.Yolk().func()");
		}
	}
	
	public BigEgg2() {
		insertYolk(new Yolk());
	}
	
	public static void main(String[] args) {
		Egg2 e2 = new BigEgg2();
		e2.gFunc();
	}
}

class Egg2 {
	protected class Yolk {
		public Yolk() {
			System.out.println("Egg2.Yolk()");
		}
		
		public void func() {
			System.out.println("Egg2.Yolk.func()");
		}
	}
	
	private Yolk y = new Yolk();
	
	public Egg2() {
		System.out.println("Egg2()");
	}
	
	public void insertYolk(Yolk yy) {
		y = yy;
	}
	
	public void gFunc() {
		y.func();
	}
}
