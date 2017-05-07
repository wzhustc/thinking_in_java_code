package thinking_chapter7;

/**
 * 
 * 本程序说明
 * 1、接口相当于一个纯的抽象类，里面定义的方法只有声明，没有主体，具体实现留在实现的方法里。
 * 2、里面定义的变量其实是常量且不可改变。
 * 3、新发现：接口引用指向实现的类对象（继承是父类引用指向子类对象），二者在使用上是相同的。
 * @author v_zhangwei13
 * Create on 2017年5月7日下午7:49:51
 */
public class InterfaceTest {
	public void start(VehicleOfInterface vi) {
		vi.start();
	}
	
	public void fix(VehicleOfInterface vi) {
		vi.fix();
	}
	
	public static void main(String[] args) {
		VehicleOfInterface ai = new AirplaneImpl();
		ai.start();
		ai.fix();
		
		VehicleOfInterface bi = new BikeImpl();
		bi.start();
		bi.fix();
	}
}

interface VehicleOfInterface {
	void start(); // automatically public 
	
	public void fix();
	
	int i = 5; // static & final
}

class AirplaneImpl implements VehicleOfInterface {

	@Override
	public void start() {
		System.out.println("Airplane fly!!");
	}

	@Override
	public void fix() {
		System.out.println("Airplane fix!!");
	}
}

class CarImpl implements VehicleOfInterface {

	@Override
	public void start() {
		System.out.println("Car run!!");
	}

	@Override
	public void fix() {
		System.out.println("Car fix!!");
	}
}

class BusImpl implements VehicleOfInterface {

	@Override
	public void start() {
		System.out.println("Bus didi!!");
	}

	@Override
	public void fix() {
		System.out.println("Bus fix!!");
	}
}

class BikeImpl implements VehicleOfInterface {

	@Override
	public void start() {
		System.out.println("Bike go!!");
	}

	@Override
	public void fix() {
		System.out.println("Bike fix!!");
	}
}



