package thinking_chapter9;

public class NeverCaught {
	public static void f() {
		throw new RuntimeException("From f()");
	}
	
	public static void g() {
		f();
	}
	
	public static void main(String[] args) {
		g();
	}
}
