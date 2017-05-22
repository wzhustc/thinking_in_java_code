package thinking_chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static List fill(List list) {
		return (List)Collection1.fill(list);
	}
	
	public static void print(List list) {
		for(Iterator it = list.iterator(); it.hasNext();) {
			System.out.print(it.next() + ", ");
		}
		System.out.println();
	}
	
	static boolean b;
	static Object obj;
	static int i;
	static Iterator it;
	static ListIterator li;
	
	public static void basicTest(List list) {
		list.add("xxx");
//		print(list);
//		list.add(1, "xxx");
//		print(list);
		list.addAll(fill(new ArrayList()));
//		print(list);
//		list.addAll(list.lastIndexOf(list)+1, fill(new ArrayList()));
		list.addAll(fill(new ArrayList()));
		print(list);
		System.out.println(list.contains("xxx"));
		System.out.println(list.containsAll(fill(new ArrayList())));
		System.out.println(list.indexOf("xxx"));
		System.out.println(list.get(10));
		System.out.println("empty ? " + list.isEmpty());
		list.add(0, "xxxx");
		System.out.println(list.iterator().next());
		System.out.println(list.listIterator().next());
		System.out.println(list.listIterator(9).next());
		System.out.println(list.lastIndexOf("4"));
		print(list);
		// [)这个是半开半闭区间，包含前面，不包含后面
		System.out.println(list.subList(2, 10));
		System.out.println(list.remove(0));
		
		print(list);
		System.out.println(list.remove("3"));
		print(list);
		System.out.println(list.set(0, "Hello"));
		print(list);
		
		System.out.println(list.retainAll(fill(new ArrayList())));
		
		System.out.println(list.size());
	}
	
	public static void iterMotion(List list) {
		ListIterator it = list.listIterator();
		System.out.println(b = it.hasNext());;
		System.out.println(b = it.hasPrevious());
//		System.out.println(it.next());// NoSuchElementException error
		
		System.out.println(i = it.nextIndex());
//		System.out.println(it.previous());  // NoSuchElementException error
		
	}
	

	public static void iterManipulation(List list) {
		ListIterator it = list.listIterator();
		it.add("47");
//		System.out.println(it.next()); //error
		System.out.println(it.previous()); // 47 可见：it.add完之后，it的指针指向迭代器下一个位置，所以it.next报错，但是it.previous没错
	
		it.set("88");
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void testVisual(List list) {
		print(list);
		List b = new ArrayList();
		fill(b);
		System.out.print("b = ");
		print(b);
		list.addAll(b);
		list.addAll(fill(new ArrayList()));
		System.out.print("a = ");
		print(list);
		System.out.println(list.size());
		ListIterator x = list.listIterator(list.size() / 2);
		x.add("one");
		print(list);
		System.out.println(x.next());
		
	}
	
	public static void testLinkedList(List list) {
		LinkedList llist = new LinkedList();
		Collection1.fill(llist, 8);
		print(llist);
		
		llist.addFirst("one");
		llist.addFirst("two");
		llist.addLast("last");
		print(llist);
		
		Iterator iter = llist.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + ", ");
		}
		System.out.println();
		
		System.out.println(llist.getFirst());
		System.out.println(llist.getLast());
		
		System.out.println(	llist.contains("6"));
		System.out.println(llist.peek());
		String[] obj = (String[])llist.toArray(new String[1]);
		
		
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i] + ", ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
//		basicTest(fill(new ArrayList()));
		
//		iterMotion(new ArrayList());
//		iterManipulation(new ArrayList());
		
//		testVisual(new ArrayList());
		
		testLinkedList(new LinkedList());
	}
}
