package thinking_chapter8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPerformance2 {
    private static final int REPS = 100;
    
    private abstract static class Tester {
    	String name;
    	int size;
    	Tester(String name, int size) {
    		this.name = name;
    		this.size = size;
    	}
    	
    	abstract void test(List list);
    }
    
    private static Tester[] tests = {
    	new Tester("getMethod", 30) {

			@Override
			void test(List list) {
				for (int i = 0; i < REPS; i++) {
					for (int j = 0; i < list.size(); j++) {
						list.get(j);
					}
				}
			}
    		
    	},
    	new Tester("iteration", 40) {

			@Override
			void test(List list) {
				for (int i = 0; i < REPS; i++) {
					Iterator iter = list.iterator();
					while(iter.hasNext()) {
						iter.next();
					}
				}
			}
    	},
    	new Tester("insert", 50) {

			@Override
			void test(List list) {
				int half = list.size() / 2;
				String s = "test";
				ListIterator it = list.listIterator(half);
				for (int i = 0; i < size * 10; i++) {
					it.add(s);
				}
			}
    	},
    	new Tester("remove", 60) {

			@Override
			void test(List list) {
				ListIterator liit = list.listIterator(3);
				while (liit.hasNext()) {
					liit.next();
					liit.remove();
				}
			}
    	}
    };
    
    public static void test(List list) {
    	System.out.println("TESTing : " + list.getClass().getName());
    	for (int i = 0; i < tests.length; i++) {
    		Collection1.fill(list, tests[i].size);
    		System.out.println(tests[i].name);
    		Long t1 = System.currentTimeMillis();
    		tests[i].test(list);
    		Long t2 = System.currentTimeMillis();
    		System.out.println("耗时： " + (t2 - t1));
    	}
    }
    
    
    public static void main(String[] args) {
		test(new ArrayList());
		
	}
}



















