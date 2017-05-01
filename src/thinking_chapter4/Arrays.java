package thinking_chapter4;

/**
 * 
 * 本程序说明
 * 1、a1和a2都是引用，当执行a2 = a1时，此时操作a2就等于操作a1，所以会打印出a1和a2值相同的情况
 * 2、如果调转下两个for循环的顺序，那么情况就是先打印出a1的值，再操作a2,此时就是2个不同值了。
 * @author v_zhangwei13
 * Create on 2017年5月1日下午8:51:28
 */
public class Arrays {
	public static void main(String[] args) {
		int[] a1 = {1, 2, 3, 4, 5};
		int[] a2;
		a2 = a1;
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1[" + i + "] = " + a1[i]);
		}
		
		for (int i = 0; i < a1.length; i++) {
			++a2[i];
			System.out.println("a2[" + i + "] = " + a2[i]);
		}
		
		Integer[] aa = new Integer[]{
				new Integer(1), new Integer(2)
		};
		System.out.println(aa);
		
	}
}
