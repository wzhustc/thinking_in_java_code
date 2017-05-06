package thinking_chapter6;

/**
 * 
 * 本程序说明子类可以向上转型为父类。比如猫是动物的一种，猫是子类，动物是父类，所以说猫是动物是没问题的，这就是向上转型
 * @author v_zhangwei13
 * Create on 2017年5月6日下午8:58:25
 */
public class Wind extends Instrument {
	public static void main(String[] args) {
		Wind wind = new Wind();
		Instrument.tune(wind);
	}
}

class Instrument {
	public void play() {
		System.out.println("play play");
	}
	
	public static void tune(Instrument i) {
		i.play();
	}
	
}
