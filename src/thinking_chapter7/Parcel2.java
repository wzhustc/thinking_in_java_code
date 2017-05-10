package thinking_chapter7;

/**
 * 
 * 本程序说明
 * 1、内部类在使用时格式：外部类名.内部类名
 * 2、
 * @author v_zhangwei13
 * Create on 2017年5月9日下午2:08:21
 */
public class Parcel2 {
	class Contents {
		private int i = 11;
		
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		Destination(String whereTo) {
			label = whereTo;
		}
		
		String readLabel() {
			return label;
		}
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents con() {
		return new Contents();
	}
	
	public void ship(String dest) {
		con();
		to(dest);
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("shanghai");
		Parcel2 pp = new Parcel2();
		Parcel2.Contents c = pp.con();
		Parcel2.Destination d = pp.to("Hefei");
		d.readLabel();
	}
	
}
