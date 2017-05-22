package thinking_chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SimpleCollection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		for (int i = 0; i < 5; i++) {
			c.add(new Integer(i));
		}
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("---------------");
		List list = new LinkedList();
		for (int i = 0; i < 3; i++) {
			list.add(new Integer(i));
		}
		
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("--------------------------");
		Object[] in = (Object[])list.toArray();
		
		for (int i = 0; i < in.length; i++) {
			System.out.println(in[i]);
		}
	}
}
