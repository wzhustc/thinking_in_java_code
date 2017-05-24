package thinking_chapter8;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {
	public final static String[][] testData1 = {
		{ "Happy", "Cheerful disposition" },
		{ "Sleepy", "Prefers dark, quiet places" },
		{ "Grumpy", "Needs to work on attitude" },
		{ "Doc", "Fantasizes about advanced degree"},
		{ "Dopey", "'A' for effort" },
		{ "Sneezy", "Struggles with allergies" },
		{ "Bashful", "Needs self-esteem workshop"},
		};
	
	public final static String[][] testData2 = {
		{ "Belligerent", "Disruptive influence" },
		{ "Lazy", "Motivational problems" },
		{ "Comatose", "Excellent behavior" }
		};
	
	public static Map fill(Map m, Object[][] o) {
		for (int i = 0; i < o.length; i++) {
			m.put(o[i][0], o[i][1]);
		}
		
		return m;
	}
	
	public static void printKeys(Map m) {
		System.out.println("m.size() : " + m.size());
		Collection1.print(m.keySet());
	}
	
	public static void printValues(Map m) {
		System.out.println("Values : ");
		Collection1.print(m.values());
		System.out.println("-----------------");
	}
	
	public  static void print(Map m) {
		Collection entries = m.entrySet();
		Iterator iter = entries.iterator();
		while (iter.hasNext()) {
			Map.Entry e = (Map.Entry)iter.next();
			System.out.print("Key = " + e.getKey() + ", Value = " + e.getValue() + "; ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Map hashMap = fill(new HashMap(), testData1);
		printKeys(hashMap);
		printValues(hashMap);
		print(hashMap);
	}
}
