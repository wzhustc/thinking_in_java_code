package thinking_chapter4;

/**
 * 
 * 本程序说明
 * 1、构造方法可以在重载的构造方法中被调用，但是只能在第一行被调用！
 * 2、全局变量可以不初始化，初始化工作由编译器完成，但是局部变量必须初始化，否则报错
 * 3、this代指当前对象，可以用来解决局部变量和全局变量重名的问题
 * 4、除了构造方法内能调用构造方法，其他普通方法是无法调用构造方法的。
 * @author v_zhangwei13
 * Create on 2017年5月1日下午5:20:02
 */
public class ConstructorTest {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.print();
	}
	
}

class Person {
	
	private int height;
	private String name;
	public Person(int height) {
		this.height = height;
		System.out.println("只含身高的构造方法被调用, height = " + height);
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("只含名字的构造方法被调用, name = " + name);
	}
	
	public Person(String name, int height) {
		this(name);
		// 不能调用2次构造方法，因为编译器会认为你第一次调用构造方法的地方是this(name),
		// 这里再次调用不符合构造方法调用规则:构造方法必须要在第一条语句使用。
//		this(height); 
		this.height = height;
		System.out.println("含两个参数的构造方法被调用");
	}
	
	public Person() {
		this("weiwei", 177);
		System.out.println("默认构造器被调用，无参数");
	}
	
	void print() {
//		this(11) // 构造器无法在其他方法中使用，只能在构造器内部使用
		System.out.println("name : " + name + ", height : " + height);
	}
	

}