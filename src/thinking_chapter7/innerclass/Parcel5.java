package thinking_chapter7.innerclass;

/**
 * 
 * 本程序说明:展示了在任意作用域内嵌套一个内部类，TrackingSlip类嵌套于一个id语句的作用域内，在定义这个类的作用域之外，不可使用
 * @author v_zhangwei13
 * Create on 2017年5月13日下午2:57:54
 */
public class Parcel5 {

	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;
				public TrackingSlip(String s) {
					id = s;
				}
				String getSlip() {
					return id;
				}
				public void printHello() {
					System.out.println("Hello");
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			ts.getSlip();
			ts.printHello();
		}
		// 不能在TrackingSlip类范围外进行使用。
//		TrackingSlip tt = new TrackingSlip("xx"); // error
	}
	
	public static void main(String[] args) {
		Parcel5 p5 = new Parcel5();
		p5.track();
	}
	
	public void track() {
		internalTracking(true);
	}
}
