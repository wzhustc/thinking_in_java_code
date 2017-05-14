package thinking_chapter7.innerclass;

/**
 * 
 * 本程序说明外部类继承后，生成外部类子类时，内部类子类不会被重写，对应代码中打印的是Egg.Yolk(),而不是BigEggEgg.Yolk()
 * @author v_zhangwei13
 * Create on 2017年5月13日下午6:00:35
 */
public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			System.out.println("BigEggEgg.Yolk()");
		}
	}
	
	public BigEgg() {
		System.out.println("new BigEgg()");
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}

class Egg {
	protected class Yolk {
		public Yolk() {
		System.out.println("Egg.Yolk()");	
		}
	}
	
	private Yolk y;
	public Egg() {
		System.out.println("new Egg()");
		y = new Yolk();
	}
}