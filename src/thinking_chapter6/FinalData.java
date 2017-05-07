package thinking_chapter6;

/**
 * 
 * 本程序说明
 * 1、程序注释
 * 2、从打印结果看，i5是一样的，说明static修饰的是全局变量，被大家公用。
 * 3、不能由于某样东西的属性是final，就认定它的值能在编译时期知道，比如i4和i5
 * @author v_zhangwei13
 * Create on 2017年5月7日上午10:40:58
 */
public class FinalData {
	final int i1 = 9;
	static final int i2 = 99;
	public static final int i3 = 999;
	final int i4 = (int)(Math.random()*20);
	static final int i5 = (int)(Math.random()*20);
	
	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
//	final Value v4; // final指向的引用必须要初始化
	
	final int[] a = {1, 2, 3, 4, 5};

	public void print(String id) {
		System.out.println(id +": i4 = " + i4 + ", i5 = " + i5);
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
//		fd1.i1++;//i1常数，无法++
		fd1.v2.i++;//v2对象的i值不是final，可以++
		fd1.v1 = new Value(); // v1引用指向新的对象
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i] ++; // 虽然数组定义为final，但是不改变数组引用，只改变对象值，ok
			System.out.println(fd1.a[i]);
		}
//		fd1.v2 = new Value(); //error v2指向的对象无法改变，只可改变对象本身，不能改变指向
//		fd1.v3 = new Value(); //同上
//		fd1.a = new int[6]; //同上
		
		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
}

class Value {
	int i = 1;
}

/**
 * fd1: i4 = 7, i5 = 17
 * Creating new FinalData
 * fd1: i4 = 7, i5 = 17
 * fd2: i4 = 6, i5 = 17
 
*/