package thinking_chapter6;

public class Car {
	
	public Engine engine;
	public Wheel[] wheel = new Wheel[4];
	public Window[] window = new Window[4];
	public Door leftDoor;
	public Door rightDoor;
	
	public Car() {
		engine = new Engine();
		for (int i = 0; i < 4; i++) {
			wheel[i] = new Wheel();
			window[i] = new Window();
		}
		leftDoor = new Door();
		rightDoor = new Door();
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.leftDoor.open();
		for (int i = 0; i < 4; i++) {
			car.wheel[i].inflate(20);
			car.window[i].down();;
		}
		
		car.engine.start();
		car.window[0].up();
		car.engine.stop();
	}
	
}

class Engine {
	public void start() {
		System.out.println("启动并前进");
	}
	
	public void stop() {
		System.out.println("刹车并停止");
	}
	
	public void rev() {
		System.out.println("倒档");
	}
}

class Wheel {
	public void inflate(int psi) {
		psi = psi + 100;
		System.out.println("胎压为:" + psi);
	}
}

class Window {
	public void product() {
		System.out.println("生成窗户");
	}
	
	public void up() {
		System.out.println("窗户上摇");
	}
	
	public void down() {
		System.out.println("窗户下摇");
	}
}

class Door {
	
	public Window window = new Window();
	
	public void open() {
		System.out.println("开门");
	}
	
	public void close() {
		System.out.println("关门");
	}
}
