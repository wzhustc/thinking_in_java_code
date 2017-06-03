package thinking_chapter8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPerformance {
	private static final int REPS = 200;
	
	private abstract static class Tester {
		String name;
		Tester(String name) {
			this.name = name;
		}
		
		abstract void test(Set set, int size);
	}
	
	private static Tester[] tests = {
		new Tester("add") {

			@Override
			void test(Set set, int size) {
				for (int i = 0; i < REPS; i++) {
					set.clear();
					Collection1.fill(set, size);
				}
			}
		},
		new Tester("contains") {

			@Override
			void test(Set set, int size) {
				for(int i = 0; i < REPS; i++) {
					for (int j = 0; j < size; j++) {
						set.contains(Integer.toString(i));
					}
				}
			}
		},
		
		new Tester("iteration") {

			@Override
			void test(Set set, int size) {
				Iterator iter = set.iterator();
				while(iter.hasNext()) {
					iter.next();
				}
			}
		}
	};
	
	public static void test(Set set, int size) {
		System.out.println("Testing " + set.getClass().getName() + " size " + size);
		Collection1.fill(set, size);
		for (int i = 0; i < tests.length; i++) {
			System.out.println(tests[i].name);
			Long t1 = System.currentTimeMillis();
			tests[i].test(set, size);
			Long t2 = System.currentTimeMillis();
			System.out.println(": " + ((double)(t2 - t1)/(double)size));
		}
	}
	
	public static void main(String[] args) {
		test(new HashSet(), 100);
		System.out.println("------------------");
		test(new HashSet(), 1000);
		System.out.println("------------------");
		test(new TreeSet(), 100);
		System.out.println("------------------");
		test(new TreeSet(), 1000);
		
	}
}
