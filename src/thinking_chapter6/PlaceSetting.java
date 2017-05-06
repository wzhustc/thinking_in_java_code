package thinking_chapter6;

/**
 * 
 * 本程序说明
 * 继承和合成之间的配合使用，对继承和组合的理解更近一步
 * 这里，继承关系有：餐盘和盘子，器具（Utensil）和勺、叉、刀，习惯(custom)和地点放置(PlaceSetting)
 * 组合关系是在地点放置里会有对勺、叉、刀和餐盘的地点放置
 * @author v_zhangwei13
 * Create on 2017年5月6日下午6:22:51
 */
class Plate {
	public Plate(int i) {
		System.out.println("Plate constructor");
		System.out.println("i = " + i);
	}
}

class DinnerPlate extends Plate {

	public DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor");
		System.out.println("i = " + i);
	}
}

// Utensil:器具
class Utensil {
	public Utensil(int i) {
		System.out.println("Utensil constructor");
		System.out.println("i = " + i);
	}
}

class Spoon extends Utensil {

	public Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
		System.out.println("i = " + i);
	}
}

class Fork extends Utensil {

	public Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
		System.out.println("i = " + i);
	}
}

class Knife extends Utensil {
	public Knife(int i) {
		super(i);
		System.out.println("Knife constructor");
		System.out.println("i = " + i);
	}
}

class Custom {
	public Custom(int i) {
		System.out.println("Custom constructor");
		System.out.println("i = " + i);
	}
}


public class PlaceSetting extends Custom {

	Spoon spoon;
	Fork fork;
	Knife knife;
	DinnerPlate dinnerPlate;
	
	public PlaceSetting(int i) {
		super(i + 1);
		spoon = new Spoon(i + 2);
		fork = new Fork(i + 3);
		knife = new Knife(i + 4);
		dinnerPlate = new DinnerPlate(i + 5);
		
		System.out.println("PlaceSetting constructor");
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		new PlaceSetting(5);
	}
}
/**
 * result:
 * Custom constructor
 * i = 6
 * Utensil constructor
 * i = 7
 * Spoon constructor
 * i = 7
 * Utensil constructor
 * i = 8
 * Fork constructor
 * i = 8
 * Utensil constructor
 * i = 9
 * Knife constructor
 * i = 9
 * Plate constructor
 * i = 10
 * DinnerPlate constructor
 * i = 10
 * PlaceSetting constructor
 * i = 5
 */
