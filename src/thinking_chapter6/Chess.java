package thinking_chapter6;

/**
 * 
 * 本程序说明
 * 在子类的构造方法中，首先会对父类的构造方法进行调用，
 * 并在这之前不能出现任何的东西。如果找不到对应的构造方法，就编译报错
 * @author v_zhangwei13
 * Create on 2017年5月6日下午3:53:33
 */
public class Chess extends BoardGame {

	public Chess() {
		super(12);
		System.out.println("Chess constructor()");
	}

	public static void main(String[] args) {
		new Chess();
	}
}

class BoardGame extends Game {

	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor()");
	}
	
}

class Game {
	public Game(int i) {
		System.out.println("Game constructor()");
	}
}