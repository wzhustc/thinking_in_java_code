package thinking_chapter6;

public class Detergent extends Cleanser {
	@Override
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub();
	}
	
	public void foam() {
		append(" foam()");
	}
	
	public static void main(String[] args) {
		Detergent d = new Detergent();
		d.dilute();
		d.apply();
		d.scrub();
		d.foam();
		d.print();
		System.out.println("Testing base cleanser");
		Cleanser.main(args);
	}
}

class Cleanser {
	private String s = new String("Cleanser");
	
	public void append(String s) {
		s += s;
	}
	
	public void dilute() {
		append(" dilute()--稀释");
	}
	
	public void apply() {
		append(" apply()-- 应用");
	}
	
	public void scrub() {
		append("scrub()-- 擦洗");
	}
	
	public void print() {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Cleanser c = new Cleanser();
		c.dilute();
		c.apply();
		c.scrub();
		c.print();
	}
	
}
