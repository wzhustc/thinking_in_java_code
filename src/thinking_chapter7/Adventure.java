package thinking_chapter7;

public class Adventure {
	static void t(CanFight x) {
		x.fight();
	}
	
	static void u(CanSwim x) {
		x.swim();
	}
	
	static void v(CanFly x) {
		x.fly();
	}
	
	static void w(ActionCharacter x) {
		x.fight();
	}
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		t(hero);
		u(hero);
		v(hero);
		w(hero);
	}
}

interface CanFly {
	void fly();
}

interface CanSwim {
	void swim();
}

interface CanFight {
	void fight();
}

class ActionCharacter {
	public void fight(){}
}

// 具体类必须首先出现，然后才是接口
class Hero extends ActionCharacter implements CanSwim, CanFly, CanFight {

	@Override
	public void fly() {
		System.out.println("interface implements of fly method");
	}

	@Override
	public void swim() {
		System.out.println("interface implements of swim method");
	}
	
}