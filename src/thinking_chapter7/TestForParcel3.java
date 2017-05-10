package thinking_chapter7;

public class TestForParcel3 {
	public static void main(String[] args) {
		Parcel3 p3 = new Parcel3();
		Contents c = p3.cont();
		Destination d = p3.dest("Hefei");
		System.out.println(c.x);
		System.out.println(d.realLabel());
	}
}
