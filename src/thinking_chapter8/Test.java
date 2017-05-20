package thinking_chapter8;

public class Test {
	public static void main(String[] args) {
		// 创建一个数组对象时，它的大小是固定的，而且不可在那个数组对象的“存在时间”内发生改变
		String[] s = new String[]{"Hello", "World", "Welcome"};
		
		System.out.println(s.length);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
		String[] ss = new String[5];
		
		for (int i = 0; i < ss.length; i++) {
			ss[i] = new Integer(i).toString();
			System.out.println(ss[i]);
		}
		
		Weeble[] a;
		Weeble[] b = new Weeble[5];
		Weeble[] c = new Weeble[4];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Weeble();
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println("[b" + i + "]=" + b[i]);
		}
		
		Weeble[] d = {new Weeble(), new Weeble(), new Weeble()};
		
		a = d;
		System.out.println("a = d 后，a.length = " + a.length);
		
		// compile error
//		System.out.println(a.length);
		System.out.println("b.length = " + b.length);
		
		
		
		
	}
}

class Weeble {
	private int i;
	Weeble() {}
	
	Weeble(int i) {
		this.i = i;
	}
}
