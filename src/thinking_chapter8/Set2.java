package thinking_chapter8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
	public static Set fill(Set set, int size) {
		for (int i = 0; i < size; i++) {
			set.add(new MyType(i));
		}
		return set;
	}
	
	public static Set fill(Set set) {
		return fill(set, 12);
	}
	
	public static void test(Set set) {
		fill(set);
		fill(set);
		System.out.println(set);
	}
	
	public static void main(String[] args) {
		test(new HashSet());
		test(new TreeSet());
	}
}

class MyType implements Comparable {
	private int i;
	
	public MyType(int n) {
		i = n;
	}
	
	public boolean equals(Object o) {
		return (o instanceof MyType) && (i == ((MyType)o).i);
	}
	
	public int hashCode() {
		return i;
	}
	
	@Override
	public String toString() {
		return i + " ";
	}
	
	@Override
	public int compareTo(Object o) {
		int i2 = ((MyType)o).i;
		return (i2 < i ? -1 : (i2 == i ? 0 : 1));
	}
}