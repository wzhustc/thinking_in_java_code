package thinking_chapter4;

/**
 * 
 * 本程序说明
 * 1、静态的类要先于动态的类加载
 * 2、初始化的过程：
 * (1)在StaticInitialization类中，先加载Table和Cupboard两个静态类，
 * (2)在加载静态类时去到这两个类里面，先去到Table类里。
 * (3)Table类中又有两个静态的Bowl类，然后就去到Bowl类中加载Bowl类。
 * (4)在Bowl类中调用其构造方法，打印出Bowl(1)，Bowl(2)两个值。
 * (5)然后Bowl类静态对象加载完了后，加载Table类，调用Table构造方法，打印出Table(1),并调用b2.f(1),打印出f(1)
 * (6)此时Table类静态对象加载完毕，后面加载Cupboard类对象
 * (7)b4和b5静态对象和上面的b1和b2过程是一样的，不赘述
 * (8)b4和b5静态对象加载完毕后，加载非静态对象b3
 * (9)调用Bowl的构造方法，打印出Bowl(3)
 * (10)b3加载完后，才是Cupboard对象自己的加载，打印出Cupboard(),并调用b4.f(2)打印出f(1)
 * (11)进入main方法，打印"Creating new Cupboard() in main"，然后又new了一次Cupboard()类
 * (12)此时，静态对象将不再重新加载，但是非静态的对象还需要重新new，打印出Bowl(3)和Cupboard()和f(2)
 * (13)回到main方法,打印Creating new Cupboard() in main
 * (14)然后再次new Cupboard()类，和上面一样的过程，不赘述。
 * (15)调用t2.f2(1)和c3.f3(1),打印出f2(1)、f3(1)结束！
 * @author v_zhangwei13
 * Create on 2017年5月1日下午8:11:38
 */
public class StaticInitialization {
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard(); // 
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		t2.f2(1);
		c3.f3(1);
	}
	
	static Table t2 = new Table(1);
	
	static Cupboard c3 = new Cupboard();
}

class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Table {
	static Bowl b1 = new Bowl(1);
	Table(int marker) {
		System.out.println("Table(" + marker + ")");
		b2.f(1);
	}
	
	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}
	
	static Bowl b2 = new Bowl(2);
}

class Cupboard {
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);
	public Cupboard() {
		System.out.println("Cupboard()");
		b4.f(2);
	}
	
	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}
	
	static Bowl b5 = new Bowl(5);
}