package thinking_chapter3;

/**
 * 本程序验证了引用和实际对象之间比较的区别：
 * 
 * == 和 != 比较的是引用，在栈内存中n1 和n2是不同的引用，而且在堆内存中指向的也是2个不同的对象
 * 但是equals对比的是2个对象的值
 * 
 * 所以n1 == n2是false， new Integer(22) == new Integer(22) 也是false，他们在堆内存中是占用2个不同地方的对象。
 * 但是equals 得到的结果是true，因为对象的值都是33.
 * @author v_zhangwei13
 *
 */
public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(new Integer(22) == new Integer(22));
		System.out.println(new Integer(33).equals(new Integer(33)));
	}
}
