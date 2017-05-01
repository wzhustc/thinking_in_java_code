package thinking_chapter2.excise;

public class Test2 {
	public static void main(String[] args) {
		if (args.length < 3 ) {
			System.out.println("参数个数不够3个");
			return;
		} else {
			for (int i = 0; i < args.length; i++) {
				System.out.println("参数为：" + args[i]);
			}
		}
	}
}
