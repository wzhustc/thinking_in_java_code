package thinking_chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Collection1 {

	public static Collection fill(Collection c, int start, int size) {
		for (int i = start; i < start + size; i++) {
			c.add(Integer.toString(i));
		}
		return c;
	}
	
	public static Collection fill(Collection c, int size) {
		return fill(c, 0, size);
	}
	
	public static Collection fill(Collection c) {
		return fill(c, 0, 10);
	}
	
	public static Collection newCollection() {
		return fill(new ArrayList());
	}
	
	public static Collection newCollection(int start, int size) {
		return fill(new ArrayList(), start, size);
	}
	
	public static void print(Collection c) {
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next() + ", ");
		}
		System.out.println();
		// print 方法第二种循环写法
//		for (Iterator i = c.iterator(); i.hasNext();) {
//			System.out.println(i.next());
//		}
//		System.out.println();
	}
	
	public static void main(String[] args) {
		Collection cc = newCollection();
		cc.add("ten");
		cc.add("eleven");
		print(cc);
		System.out.println("------------------------");
		// 把cc转换成了一个object数组了
		Object[] array = cc.toArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array[i]);
		}
		// 把cc转换成了一个
		String[] strArray = (String[])cc.toArray(new String[1]);
		System.out.println("====================================");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println("strArray[" + i + "] = " + strArray[i]);
		}
		System.out.println("------------------------------------");
		System.out.println("Collections.max(cc) = " + Collections.max(cc));
		System.out.println("Collections.min(cc) = " + Collections.min(cc));
		System.out.println("-----------------------------------");
		// 在原有的cc集合的基础上又new了十个空间
		cc.addAll(newCollection());
		print(cc);
		System.out.println("----------------------------------------------------");
		cc.remove("3");
		print(cc);
		cc.remove("3");
		cc.remove("eleven");
		cc.remove("ten");
		System.out.println("------------------");
		print(cc);
		cc.remove(newCollection());
		print(cc);
		
		cc.addAll(newCollection());
		print(cc);
		
		System.out.println("cc contains 4?" + cc.contains("4"));
		System.out.println("cc contains newCollection ? " + cc.containsAll(newCollection()));
		System.out.println("Ｔｈａｔ＇ｓ　ａｌｌ　ｃｃ，ｔｈｅｎ　ｃ２　ｂｅｇｉｎ！");
		Collection c2 = newCollection();
		print(c2);
		
		cc.retainAll(c2);
		print(cc);
		System.out.println(cc.isEmpty());
		
		c2.clear();
		System.out.println("after c2 clear :");
		print(c2);
	}
}
