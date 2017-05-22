package thinking_chapter8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		testVisual(new HashSet());
		System.out.println("---------------");
		testVisual(new TreeSet());
	}
	
	public static void testVisual(Set set) {
		Collection1.fill(set);
		Collection1.fill(set);
		Collection1.print(set);
		
	}
}
