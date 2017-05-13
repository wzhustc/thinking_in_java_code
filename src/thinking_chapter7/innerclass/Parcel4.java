package thinking_chapter7.innerclass;

public class Parcel4 {
	public Destination dest(String s) {
		// SubDestination类属于dest()方法的一部分，而不是Parcel4的一部分
		class SubDestination implements Destination {

			private String label;
			
			private SubDestination(String whereTo) {
				label = whereTo;
			}
			
			@Override
			public String realLabel() {
				return label;
			}
		}
		// 方法返回的是Destination，但是这里new的一个SubDestination，这是上溯造型的结果
		return new SubDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel4 p4 = new Parcel4();
		p4.dest("Hefei");
		
		// 定义在方法内部的类无法在该方法外部访问，只能在方法内部被访问，像20行那样
//		SubDestination sd = new SubDestination(); // error
	}
}
