package thinking_chapter7;

/**
 * 
 * 本程序说明java 单继承，可以实现多个接口
 * 尽管Hero没有为fight()明确地提供一个定义，但定义是随同ActionCharacter来的，所以这个定义会自动提供，我们可以创建Hero的对象
 * @author v_zhangwei13
 * Create on 2017年5月8日下午9:28:13
 */
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
	public void fight(){
		System.out.println("fight method");
	}
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