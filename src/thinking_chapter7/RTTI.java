package thinking_chapter7;

class Useful {
	public void f() {
		System.out.println("This is Userful f()");
	}

	public void g() {
		System.out.println("This is Userful g()");
	}
}

class MoreUseful extends Useful {
	public void f() {
		System.out.println("This is MoreUserful f()");
	}

	public void g() {
		System.out.println("This is MoreUserful g()");
	}

	public void u() {
		System.out.println("This is MoreUserful u()");
	}

	public void v() {
		System.out.println("This is MoreUserful v()");
	}

	public void w() {
		System.out.println("This is MoreUserful w()");
	}
}

public class RTTI {
	public static void main(String[] args) {
		Useful[] x = { new Useful(), new MoreUseful() };
		x[0].f();
		x[1].g();
		// Compile-time: method not found in Useful:
		// ! x[1].u();
		((MoreUseful) x[1]).u(); // Downcast/RTTI
//		((MoreUseful) x[0]).u(); // Exception thrown : Userful类就没有u这个方法
	}
}
