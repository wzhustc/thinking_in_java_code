package thinking_chapter7;

/**
 * 
 * 本程序说明抽象类（abstract class 和 interface 之间的关系）
 * 类的继承是is a 的关系，所以，AlarmDoor归根结底是Door，是is a 的关系
 * 而Door具有报警的功能，是一个功能的关系，非is a 关系，所以实现Alarm这个接口。
 * 觉得http://www.cnblogs.com/azai/archive/2009/11/10/1599584.html 这篇文章对接口和抽象类解释的很到位。
 * 抽象类中可以有方法的具体实现，但是接口中必须全部都是抽象方法，不能有实现。
 * 抽象类中一旦关系复杂起来，继承关系将难以维护，而接口把行为的具体实现和定义分离，能方便维护和修改
 * @author v_zhangwei13
 * Create on 2017年5月9日上午10:20:53
 */
public class AlarmDoor extends Door implements Alarm {

	@Override
	void open() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void closed() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		
	}
	
}

abstract class Door {
	abstract void open();
	
	abstract void closed();
	
	public void run() {
		System.out.println("dog is run");
	}
}

interface Alarm {
	void alarm();
}