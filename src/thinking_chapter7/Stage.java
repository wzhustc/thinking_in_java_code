package thinking_chapter7;

/**
 * 
 * 本程序说明使用接口比使用继承使程序具有更多灵活性和可扩展性。继承要求在编译期间所有成员都要初始化话好，都要确定下来。
 * @author v_zhangwei13
 * Create on 2017年5月14日下午4:44:20
 */
public class Stage {
	public static void main(String[] args) {
		Mood mood = new Mood();
		mood.present();
		mood.changePerson();
		mood.present();
	}
}

interface Actor {
	void act();
}

class HappyActor implements Actor {
	@Override
	public void act() {
		System.out.println("HappyActor acting...");
	}
}

class SadActor implements Actor {
	@Override
	public void act() {
		System.out.println("SadActor acting...");
	}
}

class Mood {
	Actor a = new HappyActor();
	void changePerson() {
		a = new SadActor();
	}
	void present() {
		a.act();
	}
}