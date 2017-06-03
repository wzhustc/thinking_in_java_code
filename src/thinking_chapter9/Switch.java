package thinking_chapter9;

public class Switch {
	boolean state = false;
	public boolean readState() {
		return state;
	}
	
	public void on() {
		System.out.println("switch is on");
		state = true;
	}
	
	public void off() {
		System.out.println("switch is off");
		state = false;
	}
	
	public static void main(String[] args) {
		Switch sw = new Switch();
		try {
			sw.on();
			sw.off();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			sw.off();
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
			sw.off();
		}
		
		
		try {
			sw.on();
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegalArgumentException");
		} finally {
			sw.off();
		}
	}
}
