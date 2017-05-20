package thinking_chapter8;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 
 * 本程序说明虽然把一个dog关到一个cat的容器里，但是在取出来时候转型成枚举了
 * 这时候就不会关注里面是啥，都能通过nextElement方法取出来。不报错
 * @author v_zhangwei13
 * Create on 2017年5月19日下午11:37:09
 */
public class CatsAndDogs2 {
	public static void main(String[] args) {
		Vector cat = new Vector();

		for (int i = 0; i < 4; i++) {
			cat.add(new Cat2(i));
		}
		
		for (int i = 4; i < 7; i++) {
			cat.add(new Dog2(i));
		}
		
		Enumeration ee = (Enumeration)cat.elements();
		
		
		while (ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
	}
 }

class Cat2 {
	private int catNumber;
	
	public Cat2(int i) {
		catNumber = i;
	}
	
	@Override
	public String toString() {
		return "this is cat " + catNumber;
	}
}

class Dog2 {
	private int dogNumber;
	
	public Dog2(int i) {
		dogNumber = i;
	}
	
	@Override
	public String toString() {
		return "this is dog " + dogNumber;
	}
}