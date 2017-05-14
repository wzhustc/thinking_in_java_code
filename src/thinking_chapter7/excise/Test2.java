package thinking_chapter7.excise;

public class Test2 {
	public static void main(String[] args) {
		Rodent1[] rodent = {new Mouse1(), new Gerbil1(), new Hamster1()};
		rodent[0].run();
		rodent[1].run();
		rodent[2].run();
		System.out.println("-----------------------");
		
		rodent[0].eat();
		rodent[1].eat();
		rodent[2].eat();
		
		System.out.println("-----------------------");
		
		rodent[0].drink();
		rodent[1].drink();
		rodent[2].drink();
	}
}

// 啮齿动物
interface Rodent1 {
	public void run();
	
	public void eat();
	
	public void drink();
}

class Mouse1 implements Rodent1 {

	@Override
	public void run() {
		System.out.println("Mouse is running");
	}

	@Override
	public void eat() {
		System.out.println("Mouse is eating");
	}

	@Override
	public void drink() {
		System.out.println("Mouse is drinking");
	}
}

// 鼹鼠
class Gerbil1 implements Rodent1 {

	@Override
	public void run() {
		System.out.println("Gerbil is running");
	}

	@Override
	public void eat() {
		System.out.println("Gerbil is eating");
	}

	@Override
	public void drink() {
		System.out.println("Gerbil is drinking");
	}
}

// 仓鼠
class Hamster1 implements Rodent1 {

	@Override
	public void run() {
		System.out.println("Hamster is running");
	}

	@Override
	public void eat() {
		System.out.println("Hamster is eating");
	}

	@Override
	public void drink() {
		System.out.println("Hamster is drinking");
	}
}