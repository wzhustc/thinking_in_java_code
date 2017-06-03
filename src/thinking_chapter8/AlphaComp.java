package thinking_chapter8;

import java.util.Comparator;

public class AlphaComp implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = ((String)(o1)).toLowerCase();
		String s2 = ((String)(o2)).toLowerCase();
		
		return s1.compareTo(s2);
	}
	
	public static void main(String[] args) {
		
	}
}
