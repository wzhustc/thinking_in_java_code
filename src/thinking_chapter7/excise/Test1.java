package thinking_chapter7.excise;

public class Test1 {
	public static void main(String[] args) {
		Rodent[] rodent = {new Mouse(), new Gerbil(), new Hamster()};
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

// 锯齿动物
abstract class Rodent {
	abstract void run();
	
	abstract void eat();
	
	abstract void drink();
}

class Mouse extends Rodent {

	@Override
	void run() {
		System.out.println("Mouse is running");
	}

	@Override
	void eat() {
		System.out.println("Mouse is eating");
	}

	@Override
	void drink() {
		System.out.println("Mouse is drinking");
	}
}

// 鼹鼠
class Gerbil extends Rodent {

	@Override
	void run() {
		System.out.println("Gerbil is running");
	}

	@Override
	void eat() {
		System.out.println("Gerbil is eating");
	}

	@Override
	void drink() {
		System.out.println("Gerbil is drinking");
	}
}

// 仓鼠
class Hamster extends Rodent {

	@Override
	void run() {
		System.out.println("Hamster is running");
	}

	@Override
	void eat() {
		System.out.println("Hamster is eating");
	}

	@Override
	void drink() {
		System.out.println("Hamster is drinking");
	}
}






