package thinking_chapter4;

public class SimpleConstructor {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock(i);
		}
	}
}

class Rock {
	int i;
	public Rock(int i) {
		this.i = i;
		System.out.println("构造方法被调用第" + ++i + "次");
	}
}
