package thinking_chapter8.excise;

import java.util.Enumeration;
import java.util.Vector;

public class Gerbil {

	private int gerbilNumber;
	
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	
	public void hop(int gerbilNumber) {
		System.out.println("Gerbil # " + gerbilNumber);
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		for (int i = 0; i < 4; i++) {
			v.add(new Gerbil(i));
			Gerbil ge = (Gerbil)v.elementAt(i);
			ge.hop(i);
		}
		System.out.println("---------------------");
		for (int i = 0; i <= v.capacity(); i++) {
			Enumeration e = v.elements();
			Gerbil g = (Gerbil)e.nextElement();
			g.hop(i);
		}
	}
	
}
