package thinking_chapter7;

public class Parcel3 {
	// private 修饰内部类，则只有Parcel3能访问SubContents
	private class SubContents extends Contents {
		int value = 11;
		@Override
		public int value() {
			return value;
		}
	}
	
	// protected 修饰内部类，则除了Parcel3,Parcel3包内的类以及Parcel3的继承者以外，其他都不能访问SubDestination
	protected class SubDestination implements Destination {
		private String label;

		@Override
		public String realLabel() {
			return label;
		}
		
		private SubDestination(String whereTo) {
			label = whereTo;
		}
	}
	
	public Destination dest(String dest) {
		System.out.println("return new SubDestination " + dest);
		return new SubDestination(dest);
	}
	
	public Contents cont() {
		System.out.println("return new SubContents()");
		return new SubContents();
	}
}

abstract class Contents {
	// 抽象类中的变量其实是public static的
	int x = 22;
	abstract public int value();
	// 抽象类中也可以有非抽象方法哦！！！
	public int noneAbstractValue() {
		return x;
	}
}

interface Destination {
	// 接口会将自己所有的成员都变成public属性！！
	String realLabel();
}
