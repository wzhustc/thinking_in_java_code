package thinking_chapter8;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class Statistics {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for (int i = 0; i < 2000; i++) {
			Integer r = new Integer((int)(Math.random() * 20));
			if (ht.containsKey(r)) {
				((Counter)ht.get(r)).i++;
			} else 
				ht.put(r, new Counter());
		}
		System.out.println(ht);
	}
}

class Counter {
	int i = 0;
	
	public String toString() {
		return Integer.toString(i);
	}
}