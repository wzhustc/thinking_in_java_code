package thinking_chapter8;

import java.util.Hashtable;
import java.util.LinkedList;

public class SpringDetector {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for (int i = 0; i < 10; i++) {
			ht.put(new Groundhog(i), new Prediction());
			System.out.println("ht : " + ht + "\n");
			System.out.println("Looking up prediction for groundhog #3:");
			Groundhog gh = new Groundhog(2);
			if (ht.containsKey(gh)) {
				System.out.println(ht.get(gh));
			}
			
		}
		
		LinkedList list = new LinkedList();
	}
}

class Groundhog {
	
	int ghNumber;
	
	public Groundhog(int n) {
		ghNumber = n;
	}
	
	@Override
	public int hashCode() {
		return ghNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Groundhog) && (ghNumber == ((Groundhog)obj).ghNumber);
	}
}

class Prediction {
	boolean shadow = Math.random() > 0.5;

	public String toString() {
		if (shadow)
			return "Six more weeks of Winter!";
		else
			return "Early Spring!";
	}
}