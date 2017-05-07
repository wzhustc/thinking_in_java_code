package thinking_chapter7;

/**
 * 
 * 本程序说明
 * 多态的一个好处：
 * 在本程序中，在Drive类中，只需要在drive方法中传入一个交通工具，这个交通工具在编译的时候动态绑定，可以避免写很多注释的代码
 * 同时，在扩展性上，假如还有一个是修理的方法fix,那么只需要写一次，而不需要指数级的增长fix方法的代码.
 * 还有一条是抽象类，因为我们对Vehicle类的2个方法只是做继承用，这2方法本身是什么并不在乎，所以可以抽象为抽象方法，这就导致Vehicle类都是抽象了
 * @author v_zhangwei13
 * Create on 2017年5月7日下午4:08:41
 */
public class Goout {
	public static void drive(Vehicle vehicle) {
		vehicle.start();
	}
	
	// fix的代码
	public static void fix(Vehicle vehicle) {
		vehicle.fix();
	}
	
//	public static void drive(Car car) {
//		car.start();
//	}
//	
//	public static void drive(Airplane airplane) {
//		airplane.start();
//	}
//	
//	public static void drive(Bike bike) {
//		bike.start();
//	}
//	
//	public static void fix(Car car) {
//		car.fix();
//	}
//	
//	public static void fix(Airplane airplane) {
//		airplane.fix();
//	}
//	
//	public static void fix(Bike bike) {
//		bike.fix();
//	}
	
	
	public static void main(String[] args) {
		Vehicle air = new Airplane(); //父类引用指向子类对象
		Goout.drive(air);
		Vehicle bike = new Bike(); //父类引用指向子类对象
		Goout.drive(bike);
		Vehicle bus = new Bus(); //父类引用指向子类对象
		bus.fix();
		Vehicle car = new Car(); //父类引用指向子类对象
		car.fix();
		
		Vehicle car2 = new Car(); //父类引用指向之类对象时，保证了引用只能调用重写的方法，而子类独有的方法，引用无法感知，下面这行error
//		car2.stop() // error 因为父类引用无法感知子类独有的方法，他只能感知到子类继承自父类的方法。
		car2.fix();
	}
}

abstract class Vehicle {
	public abstract void start();
	public abstract void fix();
}

class Airplane extends Vehicle {
	@Override
	public void start() {
		System.out.println("Airplane fly!!");
	}
	@Override
	public void fix() {
		System.out.println("Vehicle fix!!");
	}
}

class Car extends Vehicle {
	@Override
	public void start() {
		System.out.println("Car run!!");
	}
	@Override
	public void fix() {
		System.out.println("Car fix!!");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}
}

class Bike extends Vehicle {
	@Override
	public void start() {
		System.out.println("Bike go!!");
	}
	@Override
	public void fix() {
		System.out.println("Bike fix!!");
	}
}

class Bus extends Vehicle {
	@Override
	public void start() {
		System.out.println("Bus didi!!");
	}
	
	@Override
	public void fix() {
		System.out.println("Bus fix!!");
	}
	
}