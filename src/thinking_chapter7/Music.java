package thinking_chapter7;

/**
 * 
 * 本程序说明
 * 多态的三个条件：继承、重写、父类引用指向子类对象
 * @author v_zhangwei13
 * Create on 2017年5月7日下午2:37:35
 */
public class Music {
	public static void tune(Instrument i) {
		i.play(Note.middleC);
	}
	
	public static void main(String[] args) {
		Wind wind = new Wind();
		// 多态的另外一个条件：父类引用指向子类对象
		tune(wind);
		tune(new Pinao());
	}
}

class Note {
//	private int value;
//	private Note(int value) {
//		this.value = value;
//	}
	
	public static final Note middleC = new Note();
//	public static final Note cSharp = new Note(1);
//	public static final Note cFlat = new Note(2);
}

class Instrument {
	public void play(Note n) {
		System.out.println("Instrument.play()");
	}
}

class Wind extends Instrument {
	// 多态的条件：继承和重写
	public void play(Note n) {
		System.out.println("Wind.play()");
	}
}

class Pinao extends Instrument {
	// 多态的条件：继承和重写
	public void play(Note n) {
		System.out.println("Pinao.play()");
	}
}