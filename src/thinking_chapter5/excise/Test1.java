package thinking_chapter5.excise;

public class Test1 {
	
	public String publicParam = "this is publicParam";
	
	private String privateParam = "this is privateParam";
	
	protected String protectedParam = "this is protectedParam";
	
	String friendlyParam = "this is protectedParam";
	
	public void publicMethod() {
		System.out.println("this is public method");
	}
	
	private void privateMethod() {
		System.out.println("this is private method");
	}
	
	protected void protectedMethod() {
		System.out.println("this is protected method");
	}
	
	void friendlyMethod() {
		System.out.println("this is friendly method");
	}
	
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.publicParam);
		System.out.println(t1.privateParam);
		System.out.println(t1.friendlyParam);
		System.out.println(t1.protectedParam);
		
		t1.publicMethod();
		t1.privateMethod();
		t1.friendlyMethod();
		t1.protectedMethod();
	}
}




