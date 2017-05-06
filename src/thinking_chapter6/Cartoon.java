package thinking_chapter6;

public class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon constructor() is invoked");
	}
	
	public static void main(String[] args) {
		new Cartoon();
	}
}

class Drawing extends Art {
	public Drawing() {
		System.out.println("Drawing constructor() is invoked");
	}
}

class Art {
	public Art() {
		System.out.println("Art constructor() is invoked");
	}
}