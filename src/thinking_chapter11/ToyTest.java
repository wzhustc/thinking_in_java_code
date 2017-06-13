package thinking_chapter11;

interface HasBatteries {
}

interface Waterproof {
}

interface ShootsThings {
}

class Toy {
	// Comment out the following default
	// constructor to see
	// NoSuchMethodError from (*1*)
	Toy() {
	}

	Toy(int i) {
	}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, ShootsThings {
	FancyToy() {
		super(1);
	}
}
/**
 * 
 * 本程序有问题，可能是java版本问题，一直抛空指针异常
 * @author v_zhangwei13
 * Create on 2017年6月11日下午1:23:09
 */
public class ToyTest {
	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("FancyToy");
		} catch (ClassNotFoundException e) {
		}
		printInfo(c);
		Class[] faces = c.getInterfaces();
		for (int i = 0; i < faces.length; i++)
			printInfo(faces[i]);
		Class cy = c.getSuperclass();
		Object o = null;
		try {
			// Requires default constructor:
			o = cy.newInstance(); // (*1*)
		} catch (Exception e) {
			e.printStackTrace();
		}
		printInfo(o.getClass());
	}

	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + " is interface? ["
				+ cc.isInterface() + "]");
	}
}