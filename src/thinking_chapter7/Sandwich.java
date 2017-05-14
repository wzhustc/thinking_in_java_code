package thinking_chapter7;

/**
 * 
 * 本程序展示:父类和子类之间的构造方法调用顺序
 * (1) 调用父类构造方法。这个步骤会不断重复下去，首先得到构造的是分级结构的根部，然后是下一个父类，等等。直到抵达最深一层的子类。
 * (2) 按声明顺序调用成员初始化模块。
 * (3) 调用子类构造方法的主体。
 * 通俗的说：先父类一级一级往上构造好，直到最顶层（这里是到meal类），再是当前子类的所有成员都构造好（这里是Bread,Cheese和lettuce），
 * 最后是当前子类自己构造好（Sandwich类）
 * @author v_zhangwei13
 * Create on 2017年5月14日下午3:39:12
 */
public class Sandwich extends PortableLunch {
	Bread b = new Bread();
	Cheese c = new Cheese();
	Lettuce l = new Lettuce();
	
	public Sandwich() {
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}
}

class Meal {
	public Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	public Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	public Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	public Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	public Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	public PortableLunch() {
		System.out.println("PortableLunch()");
	}
}

